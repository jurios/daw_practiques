/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nombresEstudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce nombres de estudiantes (escribe 'salir' para finalizar):");

        while (true) {
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            nombresEstudiantes.add(nombre);
            System.out.println("Estudiantes registrados hasta ahora:");
            for (String estudiante : nombresEstudiantes) {
                System.out.println(estudiante);
            }
            System.out.println("\nIntroduce otro nombre o escribe 'salir' para finalizar:");
        }

        scanner.close();
        System.out.println("Finalizando programa. Estudiantes registrados:");
        nombresEstudiantes.forEach(System.out::println);
    }
}
