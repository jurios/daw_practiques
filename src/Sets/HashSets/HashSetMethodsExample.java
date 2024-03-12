package src.Sets.HashSets;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class HashSetMethodsExample {
    public static void main(String[] args) {
        // Crear una LinkedList para la lista de la compra
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Ada");
        set.add("Ritchie");
        set.add("Turing");
        
        System.out.println("Imprimiendo el set inicial :" + set);

        // Attempt to add a duplicate element
        set.add("Turing");
        System.out.println("Imprimiendo el set después de añadir, de nuevo, a Turing : " + set);
        
        set.add(null);
        set.add(null);
        System.out.println("Imprimiendo el set después de añadir dos veces null : " + set);

        // Removing an element
        set.remove("Ritchie");

        // Checking if a set contains an element
        System.out.println("El set contiene a Turing? " + set.contains("Turing"));
        System.out.println("El set contiene a Linus? " + set.contains("Linus"));

        System.out.print("Iterando sobre los elementos ");
        // Iterating over elements
        for (String element : set) {
            System.out.print(element + ", ");
        }
        System.out.println("");
    }
}
