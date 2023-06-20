import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        String[] wordCount = enteredText.split(" ");
        System.out.println("В цьому тексті " + wordCount.length + " сдів.");


    }
}
