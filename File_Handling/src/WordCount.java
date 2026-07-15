import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {

        try {
            // Open the file
            File file = new File("Student.txt");
            Scanner sc = new Scanner(file);

            int wordCount = 0;

            // Read the file line by line
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Remove leading/trailing spaces
                line = line.trim();

                // Count words if the line is not empty
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }

            sc.close();

            System.out.println("Total number of words in the file: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}