import java.util.Scanner;

public class MazeParser {
    private MazeCommandWords commandWords;
    private Scanner reader;

    public MazeParser() {
        commandWords = new MazeCommandWords();
        reader = new Scanner(System.in);
    }

    public MazeCommand getCommand() {
        System.out.print("> ");
        String inputLine = reader.nextLine();
        String[] words = inputLine.split(" ");
        
        String word1 = words[0];
        String word2 = (words.length > 1) ? words[1] : null;

        if (commandWords.isCommand(word1)) {
            return new MazeCommand(word1, word2);
        } else {
            return new MazeCommand(null, null);
        }
    }
}
