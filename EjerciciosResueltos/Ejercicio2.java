/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> nombresEstudiantes = new LinkedList<>();

        System.out.println("Introduce nombres de estudiantes o escribe 'eliminar' para eliminar el último nombre introducido. Escribe 'salir' para finalizar:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            } else if (input.equalsIgnoreCase("eliminar")) {
                if (!nombresEstudiantes.isEmpty()) {
                    System.out.println("Eliminado: " + nombresEstudiantes.removeLast());
                } else {
                    System.out.println("La lista está vacía, no hay nombres para eliminar.");
                }
            } else {
                nombresEstudiantes.add(input);
            }

            System.out.println("Estudiantes registrados hasta el momento:");
            for (String nombre : nombresEstudiantes) {
                System.out.println(nombre);
            }
            System.out.println("Continúa introduciendo nombres, escribe 'eliminar' para eliminar el último nombre introducido, o escribe 'salir' para finalizar.");
        }

        scanner.close();
        System.out.println("Aplicación finalizada.");
    }
}
