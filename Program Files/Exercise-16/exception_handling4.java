public class exception_handling4 {
    public static void main(String[] args) {
        try {
            String input = "abc";
            int num = Integer.parseInt(input);
            System.out.println("Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
    }
}