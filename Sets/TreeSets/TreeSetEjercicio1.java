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
 * @author jordi
 */
public class TreeSetEjercicio1 {
    public static void main(String[] args) {
        // Creamos un Comparator personalizado para ordenar primero pares y luego impares
        Comparator<Integer> ordenParImpar = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Verificar si ambos números son pares o ambos impares (se mantiene el orden natural)
                if ((o1 % 2 == 0 && o2 % 2 == 0) || (o1 % 2 != 0 && o2 % 2 != 0)) {
                    return o1.compareTo(o2);
                }
                // Si o1 es par y o2 es impar, o1 va primero
                else if (o1 % 2 == 0 && o2 % 2 != 0) {
                    return -1;
                }
                // Si o1 es impar y o2 es par, o2 va primero
                else {
                    return 1;
                }
            }
        };

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
        set = new TreeSet<>(ordenParImpar);

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
