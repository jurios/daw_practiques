package Lists.ArrayLists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordi
 */
public class ArrayListMethodsExample {
    public static void main(String[] args) {
        // Crear una ArrayList para la lista de la compra
        ArrayList<String> listaCompra = new ArrayList<>();

        // Añadir elementos
        listaCompra.add("Leche"); // Añade al final
        listaCompra.add(0, "Huevos"); // Añade en la posición 0
        System.out.println("Lista de la compra inicial: " + listaCompra);

        ArrayList<String> verduras = new ArrayList<>();
        listaCompra.add("Tomate"); // Añade al final
        listaCompra.add("Lechuga"); // Añade al final
        listaCompra.add("Cebolla"); // Añade al final
        
        
        listaCompra.addAll(1, verduras);
        System.out.println("Después de añadir verduras: " + listaCompra);

        // Recuperar un elemento en una posición determinada
        String item = listaCompra.get(3);
        System.out.println("Elemento en posición 3: " + item);

        // Devuelve el índice de un elemento (primera y última ocurrencia)
        int primeraCebolla = listaCompra.indexOf("Cebolla");
        int ultimaCebolla = listaCompra.lastIndexOf("Cebolla");
        System.out.println("Primera posición de 'Cebolla': " + primeraCebolla);
        System.out.println("Última posición de 'Cebolla': " + ultimaCebolla);

        // Reemplaza elementos en una posición
        listaCompra.set(0, "Pan");
        System.out.println("Después de reemplazar huevos por pan: " + listaCompra);

        // Ordena los elementos del array
        listaCompra.sort(Comparator.naturalOrder());
        System.out.println("Lista de la compra ordenada: " + listaCompra);

        // Elimina elementos situados en una posición
        String eliminado = listaCompra.remove(2); // Elimina el elemento en la posición 2
        System.out.println("Elemento eliminado: " + eliminado);
        System.out.println("Después de eliminar el elemento en la posición 2: " + listaCompra);
    }
}
