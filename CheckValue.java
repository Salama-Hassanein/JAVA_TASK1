public class CheckValue {
    public static void main(String[] args) {
        if (args.length > 0){
            String input = args[0];
            System.out.println("input value is: " + input);
        }
        else{
            System.out.println("No input provided");
        }
    }
}
