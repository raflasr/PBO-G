public class SupportSystem {
    private Responder responder;
    private InputReader reader;

    public SupportSystem() {
        responder = new Responder();
        reader = new InputReader();
    }

    public void start() {
        System.out.println("Welcome to the Soft Technical Support System.");
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");

        boolean finished = false;
        while (!finished) {
            String input = reader.getInput();
            if (input.equals("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        System.out.println("Thank you for using the Soft Technical Support System. Goodbye!");
    }

    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
