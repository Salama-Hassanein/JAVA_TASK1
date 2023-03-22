public class PrintStringPerNumber {
    public static void main(String[] args) {
    
        if (args.length == 2) {
            int numLines = Integer.parseInt(args[0]);
            String message = args[1];
            for (int i = 0; i < numLines; i++) {
                System.out.println(message);
            }
        } else {
            System.out.println("Invalid number of arguments.");
        }
    }

    }   
