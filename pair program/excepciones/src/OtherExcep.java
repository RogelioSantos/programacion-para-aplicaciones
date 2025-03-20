public class OtherExcep {
        public void lanzarExcepcion() throws Exception  {
            try {
                OtherExcep e = null;
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


