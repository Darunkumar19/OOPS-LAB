import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=input.nextInt();
        System.out.print("Enter the second number:");
        int b=input.nextInt();
        System.out.println("The sum of the two numbers is "+(a+b));
    }
}