package Sets.HashSets;


import java.util.ArrayList;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Optimización de operaciones
 *
 * Escribe un programa que compare los tiempos que tarda un ArrayList y un
 * HashSet en comprobar la existencia de un valor.
 *
 * @author jordi
 */
public class HashSetEjercicio1 {
    public static void main(String[] args) {
        // Número de valores a generar en la collection
        int numeroElementos = 1000000;

        // El valor a comprobar existencia. Seleccionaremos el último añadido
        // para obtener los valores en el peor de los casos (en el ArrayList debe
        // recorrer toda la lista)
        int searchValue = numeroElementos - 1;

        // Rellenamos la lista
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numeroElementos; i++) {
            list.add(i);
        }

        // Rellenamos el HashSet con los mismos elementos que el ArrayList
        HashSet<Integer> set = new HashSet<>(list);

        // Tomamos los tiempos en ArrayList
        long startTimeArrayList = System.nanoTime();
        boolean existsInArrayList = list.contains(searchValue);
        long endTimeArrayList = System.nanoTime();
        long durationArrayList = endTimeArrayList - startTimeArrayList;

        // Tomamos los tiempos en HashSet
        long startTimeHashSet = System.nanoTime();
        boolean existsInHashSet = set.contains(searchValue);
        long endTimeHashSet = System.nanoTime();
        long durationHashSet = endTimeHashSet - startTimeHashSet;

        System.out.println("Existe en ArrayList? " + existsInArrayList);
        System.out.println("Existe en ArrayList? " + existsInHashSet);

        // Print the results
        System.out.println("Tiempo que tarda en detectar la existencia in ArrayList: " + durationArrayList + " nanoseconds");
        System.out.println("Tiempo que tarda en detectar la existencia del HashSet: " + durationHashSet + " nanoseconds");
    }
}
