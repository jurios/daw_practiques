/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maps.HashMaps;

import java.util.HashMap;

/**
 *
 * @author jordi
 */
public class HashMapMethodsExample {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<String, Integer> empleados = new HashMap<>();

        // Añadir elementos al HashMap
        empleados.put("Juan Perez", 1001);
        empleados.put("Ana Gómez", 1002);
        empleados.put("Luis Ramírez", 1003);

        // Obtener un elemento
        System.out.println("ID de Ana Gómez: " + empleados.get("Ana Gómez"));

        // Comprobar si un elemento existe
        if (empleados.containsKey("Juan Perez")) {
            System.out.println("Juan Perez está en la lista de empleados.");
        }

        // Eliminar un elemento
        empleados.remove("Luis Ramírez");
        System.out.println("Luis Ramírez ha sido eliminado de la lista de empleados.");

        // Iterar sobre el HashMap
        System.out.println("Lista de empleados actualizada:");
        for (String empleado : empleados.keySet()) {
            System.out.println("Nombre: " + empleado + ", ID: " + empleados.get(empleado));
        }

        //Comprobar que podemos modificar un valor con put
        empleados.put(null, 70);
        System.out.println("HashMap modificación con put: " + empleados);

        //Comprobar que NO podemos añadir un valor con replace
        Integer replace = empleados.replace("Nuevo empleado", 70);
        System.out.println("Valor de retorno de replace: " + replace);
        System.out.println("HashMap añadir con replace: " + empleados);
    }
}
