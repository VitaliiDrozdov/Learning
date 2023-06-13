import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        try{
            a = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Це не ціле число");
        }
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);


    }
}
