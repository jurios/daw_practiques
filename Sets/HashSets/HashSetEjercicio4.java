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
 * Detección de subconjuntos
 * 
 * Escribe un programa en que dado dos conjuntos, compruebe si el primer 
 * conjunto es subconjunto del segundo.
 * 
 * @author jordi
 */
public class HashSetEjercicio4 {
    public static void main(String[] args) {
        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2 = new HashSet<>();

        // Añadiendo elementos
        conjunto1.add(1);
        conjunto1.add(2);
        
        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(3);

        // Comprobar subconjunto
        if (conjunto2.containsAll(conjunto1)) {
            System.out.println("Conjunto1 es subconjunto de Conjunto2");
        } else {
            System.out.println("Conjunto1 no es subconjunto de Conjunto2");
        }
    }
}
