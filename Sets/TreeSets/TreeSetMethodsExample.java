package Sets.TreeSets;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *
 * @author jordi
 */
public class TreeSetMethodsExample {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        // Añadir elementos
        numeros.add(40);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(50);
        System.out.println("TreeSet original: " + numeros);

        // Eliminar un elemento
        numeros.remove(30);
        System.out.println("Después de eliminar 30: " + numeros);

        // Primer y último elemento
        System.out.println("Primer elemento: " + numeros.first());
        System.out.println("Último elemento: " + numeros.last());

        // Subconjunto
        System.out.println("Subconjunto desde 10 (inclusive) hasta 40 (exclusive): " + numeros.subSet(10, 40));

        // Elementos menores a un dado
        System.out.println("Elementos menores que 20: " + numeros.headSet(20));

        // Elementos mayores o iguales a un dado
        System.out.println("Elementos mayores o iguales que 20: " + numeros.tailSet(20));

        // Comprobar si un elemento existe
        if (numeros.contains(20)) {
            System.out.println("El conjunto contiene el número 20");
        } else {
            System.out.println("El conjunto no contiene el número 20");
        }

        //Comprobar que no podemos insertar null
        try {
            numeros.add(null);
        } catch (NullPointerException e) {
            System.out.println("No se puede insertar null en un TreeSet");
        }

    }
}
