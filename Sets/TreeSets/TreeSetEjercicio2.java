package Sets.TreeSets;


import java.util.Comparator;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Optimización de operaciones
 *
 * Escribe un programa que ordene los elementos del set por pares primero y
 * luego los impares.
 *
 * Segunda versión del TreeSetEjercicio1. Se ha creado el Comparator como una
 * clase independiente en lugar de una clase anónima.
 *
 * @author jordi
 */
public class TreeSetEjercicio2 {
    public static void main(String[] args) {
        // Creamos el TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Añadimos elementos al TreeSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);


        // Imprimimos los elementos del TreeSet
        System.out.println("Elementos del TreeSet (orden natural): " + set);

        // Creamos el TreeSet con el Comparator personalizado
        set = new TreeSet<>(new ParImparComparator());

        // Añadimos elementos al TreeSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        // Imprimimos los elementos del TreeSet
        System.out.println("Elementos del TreeSet (pares primero, luego impares): " + set);
    }
}
