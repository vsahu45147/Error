package Nullpoint;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        try {
            // Attempt to open a file that does not exist
            readFromFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFromFile(String filename) throws FileNotFoundException {
        // Try to read from the file
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        
        // If file not found, FileNotFoundException will be thrown
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
