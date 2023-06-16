package SumVsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer a = 0;
        Integer b = 0;
        Integer sum;
        System.out.println("Введіть перше ціле число");

        for (boolean i = false; i == false; ) {
            try {
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                i = true;
            } catch (Exception e) {
                System.out.println("Це не ціле число, введіть перше ціле число");
            }
        }
        System.out.println("Введіть друге ціле число");
        for (boolean i = false; i == false; ) {
            try {
                Scanner sc = new Scanner(System.in);
                b = sc.nextInt();
                i = true;
            } catch (Exception e) {
                System.out.println("Це не ціле число, введіть друге ціле число");
            }
        }
        sum = a + b;

        System.out.println("a + b = " + sum + ".");
    }
}
