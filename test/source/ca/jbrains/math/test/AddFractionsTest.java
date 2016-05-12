package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0))); /*Sum of two
        fractions*/
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0))); /*Sum of two
        fractions*/
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5))); /*Sum of two
        fractions*/
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
}

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(1,5).plus(new Fraction(2,5)));
    }

    @Test
    public void differentDenominatorsWithoutReducing() throws Exception {
        assertEquals(new Fraction(5,6), new Fraction(1,2).plus(new Fraction(1,3)));
    }

    @Test
    public void reduceResultToWholeNumber() throws Exception {
        assertEquals(new Fraction(1), new Fraction(1,3).plus(new Fraction(2,3)));
    }

    @Test
    public void oneDenominatorIsAMultipleOfTheOther() throws Exception {
        assertEquals(new Fraction(11,8), new Fraction(3,4).plus(new Fraction(5,8)));
    }

    @Test
    public void commonFactorInDenominators() throws Exception {
        assertEquals(new Fraction(11,18), new Fraction(1,6).plus(new Fraction(4,9)));
    }

    @Test
    public void reduceResultEvenWhenDenominatorsAreTheSame() throws Exception {
        assertEquals(new Fraction(3,2), new Fraction(3,4).plus(new Fraction(3,4)));
    }

    @Test
    public void negativeFractionAndReducing() throws Exception {
        assertEquals(new Fraction(1,2), new Fraction(-1,4).plus(new Fraction(3,4)));
        //BAD Practice ! Having more than 1 test in a test case.
        assertEquals(new Fraction(-1,8), new Fraction(3,8).plus(new Fraction(-1,2)));
    }

    @Test
    @Ignore("Constructor does not yet avoid negative denominators.")
    public void negativeSignsEverywhere() throws Exception {
        assertEquals(new Fraction(1,2), new Fraction(1,-4).plus(new Fraction(-3,-4)));
    }
}


/*
* -------------------------
* NOTES
* -------------------------
*
* zeroPlusZero() -
* How to check the equality of fractions using assertEquals ?
 * 1. Create an equals method for Fraction ???
  * NO ! Focus on one thing at a time, i.e. adding two fractions. Let equals be your next TODO.
  * Besides, we havent even created the fraction class yet & don't know what it should be like.
  * Also, we don't want to make a mistake in equals to cause mistakes in add.
  *
 * 2. Ask the fraction sum its int value (somehow) instead of converting it to a number.
*
* */