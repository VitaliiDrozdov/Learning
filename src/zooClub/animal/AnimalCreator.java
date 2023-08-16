package zooClub.animal;

import java.util.Scanner;

public class AnimalCreator {
    public Animal createAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть вид тваринки");
        String animalType = scanner.nextLine();
        System.out.println("Введіть ім'я тваринки");
        String animalName = scanner.nextLine();
        Animal animal = new Animal(animalType, animalName);
        return animal;
    }
}
