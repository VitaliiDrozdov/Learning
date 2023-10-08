import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        String[] wordCount = enteredText.split(" ");
        System.out.println("В цьому тексті " + wordCount.length + " сдів.");



    }
}
