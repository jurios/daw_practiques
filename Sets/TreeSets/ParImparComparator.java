/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sets.TreeSets;

import java.util.Comparator;

/**
 * Comparador que prioriza los pares sobre los impares
 * (se utiliza en TreeSetEjercicio2)
 *
 * @author jordi
 */
public class ParImparComparator implements Comparator<Integer> {

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

}
