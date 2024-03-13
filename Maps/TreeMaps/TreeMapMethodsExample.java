/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maps.TreeMaps;

import java.util.TreeMap;

/**
 *
 * @author jordi
 */
public class TreeMapMethodsExample {
    public static void main(String[] args) {
        // Crear un TreeMap
        TreeMap<String, Integer> inventario = new TreeMap<>();

        // Añadir elementos al TreeMap
        inventario.put("Manzanas", 50);
        inventario.put("Plátanos", 30);
        inventario.put("Naranjas", 20);

        // Mostrar todos los elementos, que estarán ordenados por clave
        System.out.println("Inventario inicial (ordenado por clave):");
        inventario.forEach((fruta, cantidad) -> System.out.println(fruta + ": " + cantidad));

        // Obtener un valor utilizando su clave
        System.out.println("\nCantidad de Plátanos: " + inventario.get("Plátanos"));

        // Eliminar un elemento por su clave
        inventario.remove("Naranjas");
        System.out.println("\nDespués de eliminar Naranjas:");

        // Mostrar el TreeMap después de la eliminación
        inventario.forEach((fruta, cantidad) -> System.out.println(fruta + ": " + cantidad));

        // Obtener y mostrar el primer y último elemento
        String primeraFruta = inventario.firstKey();
        String ultimaFruta = inventario.lastKey();
        System.out.println("\nPrimera fruta: " + primeraFruta);
        System.out.println("Última fruta: " + ultimaFruta);

        // Actualizar el valor para una clave existente
        inventario.put("Plátanos", 35);
        System.out.println("\nCantidad actualizada de Plátanos: " + inventario.get("Plátanos"));

        //Comprobar que no podemos insertar null
        try {
            inventario.put(null, 30);
        } catch(NullPointerException e) {
            System.out.println("No se puede insertar null como clave");
        }

    }
}
