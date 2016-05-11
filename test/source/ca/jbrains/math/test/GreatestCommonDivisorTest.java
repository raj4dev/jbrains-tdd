package ca.jbrains.math.test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreatestCommonDivisorTest {
    @Test
    public void oneAndOne() throws Exception {
        assertEquals(1, gcd(1, 1));
    }

    private int gcdTemp(int a, int b) {
        return 1;
    }

    private int gcd(int a, int b) {
        int t = 0;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
