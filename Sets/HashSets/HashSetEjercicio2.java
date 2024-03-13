package Sets.HashSets;


import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Eliminación de duplicados
 *
 * Escribe un programa que elimine de una lista de números enteros los números
 * que se repiten.
 *
 * @author jordi
 */
public class HashSetEjercicio2 {
    public static void main(String[] args) {
        int[] valores = {1, 5, 3, 7, 5, 3, 9, 1};
        HashSet<Integer> conjuntoSinDuplicados = new HashSet<>();

        for(int i = 0; i < 8; i++) {
            conjuntoSinDuplicados.add(valores[i]);
        }

        System.out.println("Lista sin Duplicados: " + conjuntoSinDuplicados);
    }
}
