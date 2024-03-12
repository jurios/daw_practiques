package Lists.LinkedLists;


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
public class LinkedListMethodsExample {
    public static void main(String[] args) {
        // Crear una LinkedList para la lista de la compra
        LinkedList<String> listaCompra = new LinkedList<>();

        // Insertar elementos
        listaCompra.addFirst("Pan"); // Añadir al principio
        listaCompra.addLast("Leche"); // Añadir al final
        listaCompra.add("Huevos"); // Añadir al final, método add común
        System.out.println("Lista de la compra después de añadir elementos: " + listaCompra);

        // Devuelve elementos
        System.out.println("Primer elemento: " + listaCompra.getFirst());
        System.out.println("Último elemento: " + listaCompra.getLast());

        // Elimina elementos
        listaCompra.removeFirst(); // Eliminar el primer elemento
        listaCompra.removeLast(); // Eliminar el último elemento
        System.out.println("Lista después de eliminar el primer y último elemento: " + listaCompra);

        // Añadir más elementos para las siguientes operaciones
        listaCompra.add("Tomate");
        listaCompra.add("Tomate");
        listaCompra.add("Cebolla");

        // Recorrer la lista descendentemente
        System.out.println("Lista recorrida descendentemente:");
        Iterator<String> iterator = listaCompra.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print("->");
            System.out.print(iterator.next());
        }
        System.out.println("");

        // Elimina la primera y última ocurrencia
        boolean removedFirstTomate = listaCompra.removeFirstOccurrence("Tomate");
        boolean removedLastTomate = listaCompra.removeLastOccurrence("Tomate");
        
        // Eliminamos la última ocurrencia de Vino (que no existe)
        boolean removedLastVino = listaCompra.removeLastOccurrence("Vino");
        System.out.println("¿Se eliminó la primera ocurrencia de Tomate? " + removedFirstTomate);
        System.out.println("¿Se eliminó la última ocurrencia de Tomate? " + removedLastTomate);
        System.out.println("¿Se eliminó la última ocurrencia de Vino? " + removedLastVino);
        System.out.println("Lista después de eliminar las ocurrencias de Tomate: " + listaCompra);
    }
}
