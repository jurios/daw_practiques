package Sets.LinkedHashSets;


import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Escribe un programa que demuestre que se mantiene el orden de inserción.
 *
 * @author jordi
 */
public class LinkedHashSetEjercicio1 {
    public static void main(String[] args) {
        // HashSet puede no mantener el orden
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        //Hay que tener en cuenta que podría mantener el orden. No es predecible
        System.out.println("Iteración HashSet (orden no predecible):");
        for (Integer number : hashSet) {
            System.out.println(number);
        }

        // LinkedHashSet mantiene el orden de inserción
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);

        System.out.println("\nIteración LinkedHashSet (orden de inserción):");
        for (Integer number : linkedHashSet) {
            System.out.println(number);
        }
    }
}
