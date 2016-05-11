package ca.jbrains.math;

public class NumberTheory {
    /*No need for a separate class for the GCD method!*/
    public static int gcd(int a, int b) {
        int t = 0;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }
}
