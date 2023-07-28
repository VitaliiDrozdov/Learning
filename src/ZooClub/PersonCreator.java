package ZooClub;

import java.util.Scanner;

public class PersonCreator {
    Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я члена клубу");
        String humanName = scanner.nextLine();
        System.out.println("Введіть вік " + humanName);
        Integer humanAge = scanner.nextInt();
        Person person = new Person(humanName, humanAge);
        return person;
    }
}
