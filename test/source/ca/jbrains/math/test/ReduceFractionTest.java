package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReduceFractionTest {
    @Test
    public void alreadyInLowestTerms() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    @Ignore("waiting to implement GCD.")
    public void reduceToNotWholeNumber() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }
}
