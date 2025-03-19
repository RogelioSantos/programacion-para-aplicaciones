import java.io.*;
import java.nio.file.*;

public class ProblemaDos {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Uso correcto: java ContarTexto <nombreDelArchivo>");
            return;
        }

        String nombreArchivo = args[0];

        try {
            // Contar caracteres del archivo
            Path archivoPath = Paths.get(nombreArchivo);
            String contenido = new String(Files.readAllBytes(archivoPath));
            int contador = 0;
            for (int i = 0; i < contenido.length(); i++) {
                if(contenido.charAt(i) != ' ' && contenido.charAt(i) != '\n' && contenido.charAt(i) != '\t'){
                    contador++;
                }
            }

            // Contar palabras del archivo
            int contadorPalabras = 0;
            for (int i = 0; i < contenido.length(); i++) {
                if(contenido.charAt(i) == ' ' || contenido.charAt(i) == '\n' || contenido.charAt(i) == '\t'){
                    contadorPalabras++;
                }
            }
            contadorPalabras++;

            // Contar lineas del archivo
            int contadorLineas = 0;
            for (int i = 0; i < contenido.length(); i++) {
                if(contenido.charAt(i) == '\n'){
                    contadorLineas++;
                }
            }
            contadorLineas++;


            System.out.println("El archivo " + nombreArchivo + " tiene " + contador + " caracteres.");
            System.out.println("El archivo " + nombreArchivo + " tiene " + contadorPalabras + " palabras.");
            System.out.println("El archivo " + nombreArchivo + " tiene " + contadorLineas + " lineas.");
            
        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar el archivo: " + e.getMessage());
        }

    }

}
