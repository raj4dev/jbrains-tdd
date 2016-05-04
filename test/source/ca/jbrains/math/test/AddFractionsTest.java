package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue()); /*Sum of two fractions*/
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());
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