package ZooClub;

import java.util.Scanner;

public class AnimalCreator {
    Animal createAnimal(){
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal(scanner.nextLine(),scanner.nextLine());
        return animal;
    }
}
