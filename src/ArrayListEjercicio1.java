
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Disponemos de un sensor de temperatura que analiza la temperatura cada hora y
 * lo persiste en un archivo de texto. 
 * 
 * Desarrollar un programa que lea dicho archivo de texto que contiene las 
 * temperaturas (en grados Celsius) registradas. 
 * 
 * Posteriormente, el programa deberá mostrar por pantalla:
 * 
 * 1. Cantidad de temperaturas registradas
 * 2. Temperatura máxima
 * 3. Temperatura mínima
 * 4. Temperatura media
 * 
 * @author jordi
 */
public class ArrayListEjercicio1 {
    private static final String PATH = "./src";
    
            
    public static void main(String[] args) {
        String nombreFichero = PATH + "/temperaturas.txt";
        
        ArrayList<Float> temperaturas = leerTemperaturas(nombreFichero);

        if (temperaturas.isEmpty()) {
            System.out.println("No se encontraron temperaturas en el fichero.");
            return;
        }

        mostrarInformacionTemperaturas(temperaturas);
    }

    /**
     * Lee las temperaturas del ficheros de temperaturas y 
     * devuelve un ArrayList con los valores leídos.
     * 
     * @param nombreFichero
     * @return 
     */
    private static ArrayList<Float> leerTemperaturas(String nombreFichero) {
        ArrayList<Float> temperaturas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    float temp = Float.parseFloat(linea.trim());
                    temperaturas.add(temp);
                } catch (NumberFormatException e) {
                    System.out.println("Se encontró un valor no válido que será omitido: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        return temperaturas;
    }

    /**
     * Mostrar información de temperatura por pantalla
     * 
     * @param temperaturas 
     */
    private static void mostrarInformacionTemperaturas(ArrayList<Float> temperaturas) {
        //Clonamos las temperaturas para ordenarlas (así no modificamos el ArrayList original
        ArrayList<Float> ordenTemperaturas = new ArrayList<Float>();
        float min = 0;
        float max = 0;
        float media = 0;
        
        ordenTemperaturas.addAll(temperaturas);
        ordenTemperaturas.sort(Comparator.naturalOrder());
        
        min = ordenTemperaturas.get(0);
        max = ordenTemperaturas.reversed().get(0);
        
        float suma = 0;
        for (Float temp : temperaturas) {
            suma += temp;
        }
        media = suma / temperaturas.size();

        System.out.println("Número de temperaturas registradas " + temperaturas.size());
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura media: " + media);
    }
}
