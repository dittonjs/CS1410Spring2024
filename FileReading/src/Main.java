import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("MyFile.txt");
        ArrayList<String> words = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while(input.hasNextLine()) {
                words.add(input.nextLine().replace("\n", ""));
            }
        }
        catch (java.io.IOException ex) {
            System.out.println("An error occurred trying to read the file: " + ex);
        }
        java.util.Collections.shuffle(words, new java.util.Random(System.currentTimeMillis()));
        for(String word: words) {
            System.out.println(word);
        }
    }
}
