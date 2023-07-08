package ZooClub;

import java.util.Scanner;

public class PersonCreator {
    Person createPerson(){
        Scanner scanner = new Scanner(System.in);
        Person person=new Person(scanner.nextLine(), scanner.nextInt());
        return person;
    }
}
