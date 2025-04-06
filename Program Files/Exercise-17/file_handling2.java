import java.io.FileWriter;
import java.io.IOException;

public class file_handling2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true); // true enables appending
            writer.write("\nAdding more data about BMW cars.");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
        }
    }
}