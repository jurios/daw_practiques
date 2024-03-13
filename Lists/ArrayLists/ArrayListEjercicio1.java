package Lists.ArrayLists;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
 * El sensor persiste la última temperatura en la primera línea del archivo de texto.
 * Para que nuestro centro de datos consuma las temperaturas en orden correcto,
 * persistir en un fichero las temperaturas en orden inverso.
 *
 * @author jordi
 */
public class ArrayListEjercicio1 {
    private static final String PATH = "./src/Lists/ArrayLists";


    public static void main(String[] args) {
        String nombreFichero = PATH + "/temperaturas.txt";
        ArrayList<Float> temperaturas = leerTemperaturas(nombreFichero);

        if (temperaturas.isEmpty()) {
            System.out.println("No se encontraron temperaturas en el fichero.");
            return;
        }

        mostrarInformacionTemperaturas(temperaturas);
        guardarTemperaturasInverso(temperaturas, PATH + "/temperaturas_inverso.txt");
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

        FileReader fr;
        BufferedReader br;

        try {
            fr = new FileReader(nombreFichero);

            try {
                br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null) {

                    try {
                        float temp = Float.parseFloat(linea.trim());
                        temperaturas.add(temp);
                    } catch (NumberFormatException e) {
                        System.out.println("Se encontró un valor no válido que será omitido: " + linea);
                    }
                }

                br.close();

            } catch (IOException e) {
                System.out.println("Error al leer en el fichero: " + e.getMessage());
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error al leer en el fichero: " + e.getMessage());
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

    /**
     * Guardamos en un fichero las temperaturas en orden inverso
     *
     * @param temperaturas
     * @param nombreFichero
     */
    private static void guardarTemperaturasInverso(ArrayList<Float> temperaturas, String nombreFichero) {
        //Clonamos con el objetivo de no afectar el ArrayList original
        ArrayList<Float> inversaTemperaturas = (ArrayList<Float>)temperaturas.clone();

        //Collections es una clase estática de Java que aporta funcionalidad
        // adicional a las colecciones. Reverse nos permite invertir el orden
        // de la collection.
        Collections.reverse(inversaTemperaturas);

        FileWriter fw;
        BufferedWriter bw;

        try {
            fw = new FileWriter(nombreFichero);

            try {
                bw = new BufferedWriter(fw);
                for (float temperatura : inversaTemperaturas) {
                    bw.write(temperatura + "\n");
                }

                System.out.println("Temperaturas guardadas en orden inverso en el fichero: " + nombreFichero);

                bw.close();

            } catch (IOException e) {
                System.out.println("Error al escribir en el fichero: " + e.getMessage());
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}
