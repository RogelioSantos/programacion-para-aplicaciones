import java.io.IOException;
import java.nio.file.*;

public class ProblemaUno {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso correcto: java App <cadena_a_eliminar> <archivo>");
            return;
        }

        String cadenaAEliminar = args[0];
        String nombreArchivo = args[1];
        
        try {
            // Leer el contenido del archivo
            Path archivoPath = Paths.get(nombreArchivo);
            String contenido = new String(Files.readAllBytes(archivoPath));

            // Eliminar todas las apariciones de la cadena
            String nuevoContenido = contenido.replace(cadenaAEliminar, "");

            // Escribir el nuevo contenido en el archivo
            Files.write(archivoPath, nuevoContenido.getBytes());

            System.out.println("Todas las apariciones de \"" + cadenaAEliminar + "\" han sido eliminadas del archivo.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar el archivo: " + e.getMessage());
        }
    }

}
