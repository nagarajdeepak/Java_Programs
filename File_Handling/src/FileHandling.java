import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // File object
        File file = new File("Student.txt");

        try {
            // 1. Create File
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write to File
            FileWriter writer = new FileWriter(file);
            writer.write("Name: Deepak Nagaraj\n");
            writer.write("Course: Java Programming\n");
            writer.write("Topic: File Handling");
            writer.close();
            System.out.println("Data written to the file successfully.");

            // 3. Read from File
            FileReader reader = new FileReader(file);
            int ch;

            System.out.println("\nContents of the file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

            //4. Delete File
            //if (file.delete()) {
            // System.out.println("\n\nFile deleted successfully.");
            //} else {
            //  System.out.println("\n\nFailed to delete the file.");
            //}

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}