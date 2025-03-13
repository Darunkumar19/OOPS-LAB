import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=input.nextLine();
        String reverse=new StringBuilder(s).reverse().toString();
        System.out.println("The reversed String is " + reverse);
    }
}