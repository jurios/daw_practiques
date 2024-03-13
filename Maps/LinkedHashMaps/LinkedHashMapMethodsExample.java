/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maps.LinkedHashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author jordi
 */
public class LinkedHashMapMethodsExample {
    public static void main(String[] args) {
        // Crear un LinkedHashMap
        LinkedHashMap<String, Integer> puntuaciones = new LinkedHashMap<>();

        // Añadir elementos al LinkedHashMap
        puntuaciones.put("Mario", 150);
        puntuaciones.put("Luigi", 200);
        puntuaciones.put("Peach", 100);

        //Demostración que se mantiene el orden de inserción
        HashMap<String, Integer> puntuacionesDesordenado = new HashMap<>();
        puntuacionesDesordenado.put("Mario", 150);
        puntuacionesDesordenado.put("Luigi", 200);
        puntuacionesDesordenado.put("Peach", 100);

        // Mostrar el orden de inserción
        System.out.println("Orden de inserción en el LinkedHashMap:");
        for (Map.Entry<String, Integer> entrada : puntuaciones.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        System.out.println("Orden HashMap:");
        for (Map.Entry<String, Integer> entrada : puntuacionesDesordenado.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        // Actualizar el valor para una clave existente
        puntuaciones.put("Luigi", 220);
        System.out.println("Actualización de la puntuación de Luigi a 220.: " + puntuaciones);

        // Obtener el valor asociado a una clave
        int puntuacionMario = puntuaciones.get("Mario");
        System.out.println("Puntuación de Mario: " + puntuacionMario);

        // Eliminar un elemento por su clave
        puntuaciones.remove("Peach");
        System.out.println("Peach ha sido eliminado del LinkedHashMap: " + puntuaciones);

        // Mostrar el LinkedHashMap actualizado
        System.out.println("LinkedHashMap actualizado:");
        puntuaciones.forEach((jugador, puntuacion) -> System.out.println(jugador + ": " + puntuacion));

        //Comprobar que podemos insertar null como clave
        puntuaciones.put(null, 30);
        System.out.println("LinkedHashMap con clave null: " + puntuaciones);

        //Comprobar que podemos modificar un valor con put
        puntuaciones.put(null, 70);
        System.out.println("LinkedHashMap modificación con put: " + puntuaciones);

        //Comprobar que NO podemos añadir un valor con replace
        Integer replace = puntuaciones.replace("Nuevo jugador", 70);
        System.out.println("Valor de retorno de replace: " + replace);
        System.out.println("LinkedHashMap añadir con replace: " + puntuaciones);
    }
}
