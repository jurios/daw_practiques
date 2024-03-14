/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosResueltos;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author jordi
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> empleados = new TreeMap<>();

        System.out.println("Sistema de registro de empleados. Elige una opción:");
        System.out.println("1. Agregar o modificar empleado");
        System.out.println("2. Eliminar empleado");
        System.out.println("3. Mostrar todos los empleados");
        System.out.println("4. Salir");

        while (true) {
            System.out.print("Opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce el ID del empleado: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Introduce el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    empleados.put(id, nombre);
                    System.out.println("Empleado con ID " + id + " agregado/modificado.");
                    break;
                case "2":
                    System.out.print("Introduce el ID del empleado a eliminar: ");
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                        if (empleados.remove(id) != null) {
                            System.out.println("Empleado con ID " + id + " eliminado.");
                        } else {
                            System.out.println("No se encontró empleado con ID " + id + ".");
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("El ID debe ser un número");
                    }
                    break;
                case "3":
                    if (empleados.isEmpty()) {
                        System.out.println("La lista de empleados está vacía");
                    } else {
                        System.out.println("Lista de empleados (ordenada por ID):");
                        empleados.forEach((clave, valor) -> System.out.println("ID: " + clave + " - Nombre: " + valor));
                    }
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
