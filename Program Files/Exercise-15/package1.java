import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class package1 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            System.out.println("File content:");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Show formatted current date
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println("\nRead on: " + formatter.format(now));

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
