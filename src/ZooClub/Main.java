package ZooClub;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        AnimalCreator animalCreator = new AnimalCreator();
        PersonCreator personCreator = new PersonCreator();

        List<Animal> animals = new ArrayList<>();
        animals.add(animalCreator.createAnimal());
        animals.add(animalCreator.createAnimal());
        animals.add(animalCreator.createAnimal());
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        List<Person> people = new ArrayList<>();
        people.add(personCreator.createPerson());
        people.add(personCreator.createPerson());
        people.add(personCreator.createPerson());
        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}
