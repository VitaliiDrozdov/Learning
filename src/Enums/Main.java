package Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Month currentMonth = Month.April;
        Season currentSeason = currentMonth.season;
        Month[] month = Month.values();
        Season[] season = Season.values();
        System.out.println("Введіть назву місяця");
        String enteredMonth = sc.next();
        boolean inProgram = true;
        while (inProgram) {
            boolean isExist = false;
            for (int i = 0; i < month.length; i++) {
                String arrayMonth = month[i].toString();
                isExist = arrayMonth.equalsIgnoreCase(enteredMonth);
                if (isExist) {
                    System.out.println("Такий місяць існує");
                    currentMonth = month[i];
                    currentSeason = currentMonth.season;
                    break;
                }
            }
            if (isExist) {
                break;
            } else {
                System.out.println("Такого місяця не існує, спробуйте ще або 0 для виходу");
                enteredMonth = sc.next();
                if (enteredMonth.equals("0")) {
                    inProgram = false;
//                    System.exit(1);
                }
            }
        }
        if (inProgram) {
            System.out.println("Виберіть дію:\r\n" +
                    "0. Вихід \t\t\t\t\t\t\t\t\t\t\t 5. Наступна пора року\r\n" +
                    "1. Усі місяці з такою ж порою року \t\t\t\t\t 6. Попередня пора року\r\n" +
                    "2. Усі місяці які мають таку саму кількість днів \t 7. Усі місяці які мають парну кількість днів\r\n" +
                    "3. Усі місяці які мають меншу кількість днів \t\t 8. Усі місяці які мають непарну кількість днів\r\n" +
                    "4. Усі місяці які мають більшу кількість днів \t\t 9. Перевірити чи введений місяць має парну кількість днів");
        }

        while (inProgram) {
            switch (sc.nextInt()) {
                case 1:
                    for (int i = 0; i < month.length; i++) {
                        if (currentMonth.season.equals(month[i].season)) {
                            System.out.println(month[i]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < month.length; i++) {
                        if (currentMonth.getDayCount() == month[i].getDayCount()) {
                            System.out.println(month[i]);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < month.length; i++) {
                        if (currentMonth.getDayCount() > month[i].getDayCount()) {
                            System.out.println(month[i]);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < month.length; i++) {
                        if (currentMonth.getDayCount() < month[i].getDayCount()) {
                            System.out.println(month[i]);
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < season.length; i++) {
                        if (currentSeason.equals(season[i])) {
                            if (i < 3) {
                                System.out.println(season[i + 1]);
                            } else {
                                System.out.println(season[0]);
                            }
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < season.length; i++) {
                        if (currentSeason.equals(season[i])) {
                            if (i == 0) {
                                System.out.println(season[3]);
                            } else {
                                System.out.println(season[i - 1]);
                            }
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < month.length; i++) {
                        if (month[i].getDayCount() % 2 == 0) {
                            System.out.println(month[i]);
                        }
                    }
                    break;
                case 8:
                    for (int i = 0; i < month.length; i++) {
                        if (month[i].getDayCount() % 2 != 0) {
                            System.out.println(month[i]);
                        }
                    }
                    break;
                case 9:
                    if (currentMonth.getDayCount() % 2 == 0) {
                        System.out.println("У вибраному місяці парна кількість днів");
                    } else {
                        System.out.println("У вибраному місяці не парна кількість днів");
                    }
                    break;
                case 0:
                    inProgram = false;
                    break;
                default:
                    System.out.println("Хибний ввід");
                    break;
            }
        }
    }
}
