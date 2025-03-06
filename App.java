
public class App {
    public static boolean isNumeric(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        if(args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        // The result of this operation
        double result = 0;

        // Determine the operator
        try {
            switch ( args[1].charAt(0) ) {
                case '+' : result = Double.parseDouble(args[0]) + Double.parseDouble(args[2]);
                    
                    break;
                case '-' : result = Double.parseDouble(args[0]) - Double.parseDouble(args[2]);
                    
                    break;
                case '*' : result = Double.parseDouble(args[0]) * Double.parseDouble(args[2]);
                    
                    break;
                case '/' : result = Double.parseDouble(args[0]) / Double.parseDouble(args[2]);
                    
                    break;
                    default: System.out.println("Operador no válido");
                    System.exit(1);
            }
        // Display result
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException encontrada en la operación" + e.getMessage());
        }
        }
}
