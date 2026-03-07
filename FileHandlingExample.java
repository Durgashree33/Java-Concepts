import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is a file handling example.");
            writer.close();
            System.out.println("File written successfully.");

            // Reading from file
            FileReader reader = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("Reading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
        }
    }
}