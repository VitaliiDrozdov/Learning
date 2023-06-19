package Vowels;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VowelsLess vowelsLess = new VowelsLess();
        String enteredText = scanner.nextLine();
        System.out.println(vowelsLess.vowelsLess1(enteredText));
        System.out.println(vowelsLess.vowelsLess2(enteredText));

    }
}
