package Sets.HashSets;


import java.util.HashSet;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Intersección de conjuntos
 *
 * Escribe un programa que defina dos conjuntos de números enteros y
 * encuentre su intersección, es decir, los elementos que se encuentran
 * en ambos conjuntos.
 *
 * @author jordi
 */
public class HashSetEjercicio3 {
    public static void main(String[] args) {
        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2 = new HashSet<>();

        // Añadiendo elementos
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);

        // Intersección
        conjunto1.retainAll(conjunto2);
        System.out.println("Intersección: " + conjunto1);
    }
}
