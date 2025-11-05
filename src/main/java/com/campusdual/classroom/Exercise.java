package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise {
    public static void main(String[] args) {
        String route = "lorem.txt";

        try (InputStream is = Exercise.class.getClassLoader().getResourceAsStream(route)) {

            if (is == null) {
                System.err.println("Error: Archivo no encontrado en el classpath. Asegúrate de que 'lorem.txt' está en src/main/resources/");
                return;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                String linea;


                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }


            }
        } catch (IOException e) {
            System.err.println("Ocurrió un error de I/O durante la lectura del archivo.");
            e.printStackTrace();
        }
    }
    }

