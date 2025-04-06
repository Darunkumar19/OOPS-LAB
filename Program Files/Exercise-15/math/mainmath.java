package math;
import math.mypack.calc;

public class mainmath {
    public static void main(String[] args) {
        calc calc = new calc();

        System.out.println("Add: 5 + 3 = " + calc.add(5, 3));
        System.out.println("Factorial of 5: " + calc.factorial(5));
        System.out.println("2^4 = " + calc.power(2, 4));
    }
}
