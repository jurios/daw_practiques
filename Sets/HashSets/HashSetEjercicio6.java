package Sets.HashSets;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Diferencia de Conjuntos
 * 
 * Escribe un programa que dados dos conjuntos de números enteros 
 * encuentre la diferencia del primer conjunto respecto al segundo, es decir, 
 * los elementos que están en el primer conjunto y no en el segundo.
 * 
 * @author jordi
 */
public class HashSetEjercicio6 {
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

        // Diferencia
        conjunto1.removeAll(conjunto2);
        System.out.println("Diferencia: " + conjunto1);
    }
}
