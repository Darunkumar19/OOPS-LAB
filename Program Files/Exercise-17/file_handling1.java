import java.io.File;

public class file_handling1 {
    public static void main(String[] args) {
        File file = new File("output.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File could not be deleted.");
        }
    }
}