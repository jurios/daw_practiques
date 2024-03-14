/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> diccionario = new LinkedHashMap<>();

        System.out.println("Diccionario con orden de inserción. Elige una opción:\n1. Agregar o modificar palabra\n2. Consultar palabra\n3. Mostrar todas las palabras\n4. Salir");

        while (true) {
            System.out.print("Opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce la palabra: ");
                    String palabra = scanner.nextLine();
                    System.out.print("Introduce la definición: ");
                    String definicion = scanner.nextLine();
                    diccionario.put(palabra, definicion);
                    System.out.println("Palabra '" + palabra + "' agregada/modificada.");
                    break;
                case "2":
                    System.out.print("Introduce la palabra a consultar: ");
                    palabra = scanner.nextLine();
                    definicion = diccionario.get(palabra);
                    if (definicion != null) {
                        System.out.println("Definición de '" + palabra + "': " + definicion);
                    } else {
                        System.out.println("La palabra '" + palabra + "' no se encuentra en el diccionario.");
                    }
                    break;
                case "3":
                    System.out.println("Palabras en el diccionario (orden de inserción):");
                    diccionario.forEach((key, value) -> System.out.println(key + ": " + value));
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}
