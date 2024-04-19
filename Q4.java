package Nullpoint;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class Q4 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command line argument.");
            return;
        }

        String filePath = args[0];

        try {
            readFileContents(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.out.println("File read permission denied: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void readFileContents(String filePath) throws IOException, FileNotFoundException, FileReadPermissionException {
        if (filePath == null) {
            throw new NullPointerException("File path is null.");
        }

        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist: " + filePath);
        }

        if (!file.canRead()) {
            throw new FileReadPermissionException("Permission denied to read the file: " + filePath);
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

