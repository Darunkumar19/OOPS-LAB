package math.mypack;

public class calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}