public class exception_handling3 {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object!");
        }
    }
}