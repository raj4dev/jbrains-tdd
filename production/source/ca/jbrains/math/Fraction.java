package ca.jbrains.math;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        final int signOfDenominator = denominator < 0 ? -1 : 1;
        //CONTRACT: GCD never returns zero.
        final int gcd = NumberTheory.gcd(numerator, denominator) * signOfDenominator;
        this.numerator = numerator / gcd;
        this.denominator = denominator /gcd;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator != that.denominator) {
            int sumNumerator = (this.numerator * that.denominator) + (that.numerator * this.denominator);
            int sumDenominator = (this.denominator * that.denominator);
            return (new Fraction(sumNumerator, sumDenominator));
        } else {
            return new Fraction(this.numerator + that.numerator, denominator); /*default denominator of 1 ensures that
         old tests will pass.*/
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numerator * 19 + denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
