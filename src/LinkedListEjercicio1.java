
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nuestros profesores de 1ºDAW son muy exigentes y nos ponen muchas tareas para
 * realizar.
 * 
 * Con el objetivo de no dejarnos ninguna tarea por hacer, vamos a hacer un
 * programa que registre tareas pendientes en un fichero. El programa leerá 
 * inicialmente las tareas desde dicho archivo de texto. Permitirá al usuario 
 * agregar nuevas tareas de forma que la última tarea añadida aparecerá primero.
 * Finalmente, guardará la lista actualizada en el mismo archivo.
 * 
 * @author jordi
 */
public class LinkedListEjercicio1 {
    private static final String PATH = "./src";
    
            
    public static void main(String[] args) {
        String nombreFichero = PATH + "/tareas.txt";
        LinkedList<String> tareas = leerTareas(nombreFichero);
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\nGestión de Tareas:");
            System.out.println("1. Ver tareas pendientes");
            System.out.println("2. Agregar nueva tarea");
            //System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    verTareas(tareas);
                    break;
                case 2:
                    System.out.print("Introduzca la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    tareas.addFirst(nuevaTarea);
                    System.out.println("Tarea agregada.");
                    break;
                case 3:
                    System.out.print("Introduzca el índice de la tarea a eliminar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < tareas.size()) {
                        tareas.remove(indice);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 4:
                    guardarTareas(tareas, nombreFichero);
                    System.out.println("Tareas guardadas. Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static LinkedList<String> leerTareas(String nombreFichero) {
        LinkedList<String> tareas = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String tarea;
            while ((tarea = br.readLine()) != null) {
                tareas.add(tarea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        return tareas;
    }

    private static void verTareas(LinkedList<String> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println(i + ": " + tareas.get(i));
            }
        }
    }

    private static void guardarTareas(LinkedList<String> tareas, String nombreFichero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            for (String tarea : tareas) {
                bw.write(tarea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}
