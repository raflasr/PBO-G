public class MazeGame {
    private MazeParser parser;
    private MazeRoom currentRoom;

    public MazeGame() {
        createRooms();
        parser = new MazeParser();
    }

    private void createRooms() {
        MazeRoom entrance = new MazeRoom("at the entrance of a dark maze");
        MazeRoom hall = new MazeRoom("in a long, narrow hall");
        MazeRoom chamber = new MazeRoom("inside a vast, echoing chamber");
        MazeRoom exit = new MazeRoom("at the maze's exit, you see light!");

        entrance.setExits(hall, null, null, null);
        hall.setExits(chamber, entrance, null, null);
        chamber.setExits(exit, hall, null, null);
        exit.setExits(null, null, null, null);

        currentRoom = entrance;  // Start game at the maze entrance
    }

    public void play() {
        printWelcome();

        boolean finished = false;
        while (!finished) {
            MazeCommand command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing. Goodbye.");
    }

    private void printWelcome() {
        System.out.println("Welcome to Escape the Maze!");
        System.out.println("Type 'help' if you need help.");
        System.out.println("You are " + currentRoom.getDescription());
        System.out.println();
    }

    private boolean processCommand(MazeCommand command) {
        if (command.isUnknown()) {
            System.out.println("I don't understand...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        } else if (commandWord.equals("go")) {
            goRoom(command);
        } else if (commandWord.equals("quit")) {
            return true;
        }

        return false;
    }

    private void printHelp() {
        System.out.println("You can use the following commands: go, quit, help");
        System.out.println("To move: go north, go south, go east, go west.");
    }

    private void goRoom(MazeCommand command) {
        if (!command.hasSecondWord()) {
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();
        MazeRoom nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("You can't go that way!");
        } else {
            currentRoom = nextRoom;
            System.out.println("You are " + currentRoom.getDescription());
        }
    }
}
