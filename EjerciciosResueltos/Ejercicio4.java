/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> conjuntoNombres = new LinkedHashSet<>();

        System.out.println("Introduce nombres para añadir al conjunto. Escribe 'salir' para finalizar.");

        while (true) {
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            boolean agregado = conjuntoNombres.add(nombre);

            if (agregado) {
                System.out.println(nombre + " ha sido añadido al conjunto.");
            } else {
                System.out.println(nombre + " ya está en el conjunto, no se ha añadido.");
            }

            System.out.println("Nombres en el conjunto hasta el momento (orden de inserción):");
            for (String nom : conjuntoNombres) {
                System.out.println(nom);
            }
            System.out.println("Continúa introduciendo nombres o escribe 'salir' para finalizar.");
        }

        scanner.close();
        System.out.println("Aplicación finalizada.");
    }
}
