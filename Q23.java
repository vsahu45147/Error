package Nullpoint;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23 {

    public static void main(String[] args) {
        String filename = "data.txt"; // Path to the input file

        try {
            // Read data from the file and perform processing
            processDataFromFile(filename);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }

    public static void processDataFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of data from the file
                System.out.println("Processing data: " + line);
                // Perform additional processing as needed
            }
        }
    }
}
