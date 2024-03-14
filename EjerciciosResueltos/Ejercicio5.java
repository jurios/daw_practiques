/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author jordi
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> nombresUsuarios = new TreeSet<>();

        System.out.println("Introduce nombres de usuarios para añadir al conjunto. ");
        System.out.println("Escribe 'salir' para finalizar.");

        while (true) {
            String nombreUsuario = scanner.nextLine();

            if (nombreUsuario.equalsIgnoreCase("salir")) {
                break;
            }

            nombresUsuarios.add(nombreUsuario);

            System.out.println("Nombres de usuarios en el conjunto (orden natural):");
            for (String nombre : nombresUsuarios) {
                System.out.println(nombre);
            }
            System.out.println("Continúa introduciendo nombres o escribe 'salir' para finalizar.");
        }

        scanner.close();
        System.out.println("Aplicación finalizada.");
    }
}
