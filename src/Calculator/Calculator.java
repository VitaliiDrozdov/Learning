package Calculator;

import java.io.IOException;

public class Calculator implements Numerable {

    @Override
    public double Devide(double a, double b) {
        if (b == 0) {
            throw new DivisionByZeroException("The b variable cannot be 0");
        }
        return a / b;
    }

    @Override
    public double Minus(double a, double b) {
        return a - b;
    }

    @Override
    public double Multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double Plus(double a, double b) {
        return a + b;
    }
}
