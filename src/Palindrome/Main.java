package Palindrome;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isPalindrome = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть слово");
        String testedWord = sc.next().toLowerCase(Locale.ROOT);
        char[] testedWordCh = testedWord.toCharArray();
        int j = testedWordCh.length - 1;
        for (int i = 0; i < testedWordCh.length / 2 & i != j; i++, j--) {
            if (testedWordCh[i] != testedWordCh[j]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
