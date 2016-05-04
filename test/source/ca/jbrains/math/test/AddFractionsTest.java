package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue()); /*Sum of two fractions*/
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
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