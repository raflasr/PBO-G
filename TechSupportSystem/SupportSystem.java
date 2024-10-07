public class SupportSystem {
    private Responder responder;
    private InputReader reader;

    public SupportSystem() {
        responder = new Responder();
        reader = new InputReader();
    }

    public void start() {
        boolean finished = false;
        printWelcome();

        while (!finished) {
            String input = reader.getInput();
            if (input.equals("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    private void printWelcome() {
        System.out.println("Welcome to the SowSoft Technical Support System.");
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    private void printGoodbye() {
        System.out.println("Thank you for using the SowSoft Technical Support System. Goodbye!");
    }

    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
