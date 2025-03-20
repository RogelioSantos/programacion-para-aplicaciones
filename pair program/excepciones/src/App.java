import java.io.*;
import java.nio.*;

public class App {
    public static void main(String[] args) throws Exception {
           try {
            throw new Exception("Hubo una excepcion");
           } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
           } finally {
            System.out.println("Se alcanzo la excepcion");
           }
    }

    class MiExcepcion extends Exception {
        public MiExcepcion(String mensaje) {
            super(mensaje);
        }
    }

    public static void metodoA() throws Exception {
        try {
            throw new Exception("Excepción en metodoA");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}






