import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=input.nextInt();
        long f=1;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        System.out.println("Factorial:" + f);
    }
}
