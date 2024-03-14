/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();

        System.out.println("Diccionario simple. Elige una opción:");
        System.out.println("1. Agregar o modificar palabra");
        System.out.println("2. Consultar palabra");
        System.out.println("3. Salir");

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
