package Calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer a = Integer.MAX_VALUE;
        Double b = 6.53d;
        Float c = 12.45f;
        Long d = 34L;
        int o = 0;
        Calculator calculator = new Calculator();
        System.out.println(calculator.Plus(a, b));
        System.out.println(calculator.Plus(b, c));
        System.out.println(calculator.Plus(c, d));
        System.out.println(calculator.Plus(d, a));
        System.out.println(calculator.Minus(a, b));
        System.out.println(calculator.Minus(b, c));
        System.out.println(calculator.Minus(c, d));
        System.out.println(calculator.Minus(d, a));
        System.out.println(calculator.Multiply(a, b));
        System.out.println(calculator.Multiply(b, c));
        System.out.println(calculator.Multiply(c, d));
        System.out.println(calculator.Multiply(d, a));
        System.out.println(calculator.Devide(a, b));
        System.out.println(calculator.Devide(b, c));
        System.out.println(calculator.Devide(c, d));
        System.out.println(calculator.Devide(d, a));
        try {
            System.out.println(calculator.Devide(b, o));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
