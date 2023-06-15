package Array;

import java.util.*;

public class Main {

    public static void lastEven(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println("Індекс останнього парного елемента: " + i + ".");
                return;
            }
        }
        System.out.println("У цьому масиві відсутні парні числа.");
    }

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 11);
        }

        System.out.println(Arrays.toString(array));

        lastEven(array);

        int positiveElementCount = 0;
        int negativeElementCount = 0;
        int positiveElemenIndextSum = 0;
        int positiveElementsProduct = 1;
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveElementCount++;
                positiveElemenIndextSum += i;
                positiveElementsProduct *= array[i];
            } else if (array[i] < 0) {
                negativeElementCount++;
            }
            if (array[i] % 2 == 0) {
                evenSum++;
            } else {
                oddSum++;
            }
        }

        if (positiveElementCount != 0) {
            System.out.println("Кількість додатних елементів: " + positiveElementCount + ".");
            System.out.println("Сумма індексів додатних елементів: " + positiveElemenIndextSum + ".");
            System.out.println("Добуток додатних елементів: " + positiveElementsProduct + ".");

        } else {
            System.out.println("У цьому масиві відсутні додатні числа.");
        }

        if (negativeElementCount != 0) {
            System.out.println("Кількість від'ємних елементів: " + negativeElementCount + ".");
        } else {
            System.out.println("У цьому масиві відсутні від'ємні числа.");
        }
        System.out.println("Кількість парних елементів: " + evenSum + ".");
        System.out.println("Кількість непарних елементів: " + oddSum + ".");


        int minValue = array[0];
        int minIndex = 0;
        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Сума найбільшого і найменшого елемента: " + (minValue + maxValue) + ".");
        System.out.println("Сума індексів найбільшого і найменшого елементів: " + (minIndex + maxIndex) + ".");

        int specialElementSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < i) {
                specialElementSum += array[i];
            }
        }
        System.out.println("Сума елементів які менші за їх індекси = " + specialElementSum + ".");
    }
}
