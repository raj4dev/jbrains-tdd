package ca.jbrains.math.test;

import ca.jbrains.math.NumberTheory;
import org.junit.Test;

import static ca.jbrains.math.NumberTheory.gcd;
import static junit.framework.TestCase.assertEquals;

public class GreatestCommonDivisorTest {
    @Test
    /*Reflexive is a mathematical term.*/
    public void reflexive() throws Exception {
        assertEquals(1, gcd(1, 1));
        //BAD Practice ! Having more than 1 test in a test case.
        assertEquals(1, gcd(1, 1));
        assertEquals(1, gcd(-1, -1));
    }

    @Test
    /*When the two numbers have no common factors.*/
    public void relativelyPrime() throws Exception {
        assertEquals(1, gcd(2, 3));
        //BAD Practice ! Having more than 1 test in a test case.
        assertEquals(1, gcd(4, 7));
        assertEquals(1, gcd(-2, -3));
    }

    @Test
    public void oneIsMultipleOfTheOther() throws Exception {
        assertEquals(3, gcd(3,9));
        //BAD Practice ! Having more than 1 test in a test case.
        assertEquals(5,gcd(5,30));
    }

    @Test
    public void commonFactor() throws Exception {
        assertEquals(2, gcd(6,8));
        //BAD Practice ! Having more than 1 test in a test case.
        assertEquals(7,gcd(49,315));
        assertEquals(4,gcd(24,-28));
    }

    @Test
    public void negatives() throws Exception {
        //BAD Practice ! Having more than 1 test in a test case.
        /* I am not sure that I like this behavior. Maybe GCD should always
        * be positive*/
        assertEquals(4,gcd(-24,28));
        assertEquals(4,gcd(24,-28));
    }

    @Test
    public void zero() throws Exception {
        assertEquals(1, NumberTheory.gcd(1,0));
        //BAD Practice ! Having more than 1 test in a test case.
        assertEquals(5, NumberTheory.gcd(0,5));
        assertEquals(0, NumberTheory.gcd(0,0));
    }
}
