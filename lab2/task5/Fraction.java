package task5;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction sum(Fraction other) {
        int newNum = numerator * other.denominator
                + other.numerator * denominator;
        int newDen = denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction minus(Fraction other) {
        int newNum = numerator * other.denominator
                - other.numerator * denominator;
        int newDen = denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction mult(Fraction other) {
        return new Fraction(
                numerator * other.numerator,
                denominator * other.denominator
        );
    }

    public Fraction div(Fraction other) {
        return new Fraction(
                numerator * other.denominator,
                denominator * other.numerator
        );
    }

    public Fraction sum(int number) {
        return sum(new Fraction(number, 1));
    }

    public Fraction minus(int number) {
        return minus(new Fraction(number, 1));
    }

    public Fraction mult(int number) {
        return mult(new Fraction(number, 1));
    }

    public Fraction div(int number) {
        return div(new Fraction(number, 1));
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}