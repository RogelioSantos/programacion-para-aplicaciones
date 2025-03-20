public class PasoSeis {
    public static void metodoA() throws Exception {
        try {
            throw new Exception("Excepción en metodoA");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    

    public static void metodoB() throws Exception {
        try {
            metodoA();
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        metodoB();
        Exception e = new Exception("Hubo una excepcion");
        e.printStackTrace();
    }

}
