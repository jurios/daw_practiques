package src.Sets.HashSets;


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
 * Unión de conjuntos
 * 
 * Escribe un programa que dados dos conjuntos de números enteros 
 * encuentre su unión, es decir, todos los elementos que están en cualquiera 
 * de los dos conjuntos.
 * 
 * @author jordi
 */
public class HashSetEjercicio5 {
    public static void main(String[] args) {
        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2 = new HashSet<>();

        // Añadiendo elementos
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        
        conjunto2.add(4);
        conjunto2.add(5);
        conjunto2.add(6);

        // Unión
        conjunto1.addAll(conjunto2);
        System.out.println("Unión: " + conjunto1);
    }
}
