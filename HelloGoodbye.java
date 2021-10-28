public class HelloGoodbye {
    public static void main(String[] args) {
        // Generate variables to take the command line arguments
        String n1 = args[0];
        String n2 = args[1];

        // print out command line arguments in a string
        System.out.println("Hello " + n1 + " and " + n2 + ".");
        System.out.println("Goodbye " + n2 + " and " + n1 + ".");
    }
}
