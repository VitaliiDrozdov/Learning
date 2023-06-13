package SU_27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SU27 su27 = new SU27(750, "Blue");

        Scanner scanner = new Scanner(System.in);

        boolean inProgram = true;

        System.out.println("Виберіть дію");

        while (inProgram) {
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    su27.engineStart();
                    break;
                case 2:
                    su27.takeoff();
                    break;
                case 3:
                    su27.landing();
                    break;
                case 4:
                    su27.movementUp();
                    break;
                case 5:
                    su27.movementDown();
                    break;
                case 6:
                    su27.movementRight();
                    break;
                case 7:
                    su27.movementLeft();
                    break;
                case 8:
                    su27.afterburner();
                    break;
                case 9:
                    su27.stealth();
                    break;
                case 10:
                    su27.nuclearStrike();
                    break;
                case 0:
                    inProgram = false;
                    break;
                default:
                    System.out.println("test");
            }
        }
    }
}
