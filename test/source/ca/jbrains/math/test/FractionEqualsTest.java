package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));/*Use different instances of a fraction. By default, any
        object is equal to itself !!!*/
    }

    @Test
    public void differentNumerators() throws Exception {
        assertNotEquals(new Fraction(1,5), new Fraction(2,5));
    }

    @Test
    public void differentDenominators() throws Exception {
        assertNotEquals(new Fraction(3,4), new Fraction(3,7));
    }

    @Test
    public void wholeNumberEqualsSameFraction() throws Exception {
        assertEquals(new Fraction(5,1), new Fraction(5));
    }

    @Test
    public void wholeNumberNotEqualsToDifferentWholeNumber() throws Exception {
        assertNotEquals(new Fraction(6), new Fraction(5));
    }
}

/*
* ----------------------------
* NOTES
* ----------------------------
*
* Read the comments here - http://online-training.jbrains.ca/courses/wbitdd-01/lectures/133487
* Here is a snippet:
* By implementing equals() before the properties have stabilized, we risk (in principle) implementing equals()
* in a way that could break LSP or Liskov substitution principle. In practice, the risk is relatively small in
* our fractions example. But of course, if we work carefully when risk is low, then we find it easier to work
* carefully when risk is higher.
*
* */

