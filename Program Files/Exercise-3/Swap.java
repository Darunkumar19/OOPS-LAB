import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=input.nextInt();
        System.out.print("Enter the second number:");
        int b=input.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The first number is:"+a);
        System.out.println("The second number is:"+b);
    }
}