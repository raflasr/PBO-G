public class MazeCommandWords {
    private String[] validCommands;

    public MazeCommandWords() {
        validCommands = new String[] { "go", "quit", "help" };
    }

    public boolean isCommand(String aString) {
        for (String command : validCommands) {
            if (command.equals(aString)) {
                return true;
            }
        }
        return false;
    }
}
