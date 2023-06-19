package Vowels;

import java.util.Arrays;

public class VowelsLess {

    public VowelsLess() {
    }

    public static String vowelsLess1(String enteredText) {
        return enteredText.replaceAll("a", "-").
                replaceAll("A", "-").
                replaceAll("e", "-").
                replaceAll("E", "-").
                replaceAll("i", "-").
                replaceAll("I", "-").
                replaceAll("o", "-").
                replaceAll("O", "-").
                replaceAll("u", "-").
                replaceAll("U", "-").
                replaceAll("y", "-").
                replaceAll("Y", "-");
    }

    public static String vowelsLess2(String enteredText) {
        char[] ch = enteredText.toCharArray();
        String vowels = "aeiouyAEIOUY";
        for (int i = 0; i < ch.length; i++) {
            int a = vowels.indexOf(ch[i]);
            if (a >= 0) {
                ch[i] = '-';
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : ch) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
