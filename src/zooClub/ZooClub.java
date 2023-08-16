package zooClub;

import zooClub.animal.Animal;
import zooClub.animal.AnimalCreator;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Animal>> zooMap = new HashMap();

    public ZooClub() {
    }

    public void addPerson() {
        System.out.println("Введіть ім'я члена клубу");
        String humanName = new Scanner(System.in).nextLine();
        Person person = new Person(humanName);
        if (zooMap.containsKey(person)) {
            System.out.println("Член з таким ім'ям уже є в клубі");
            return;
        }
        System.out.println("Введіть вік " + humanName);
        person.setHumanAge(new Scanner(System.in).nextInt());
        List<Animal> animalList = new LinkedList<>();
        zooMap.put(person, animalList);
        System.out.println("Додано нового члена клубу, " + humanName);
    }

    public void addAnimalToPerson() {
        System.out.println("Введіть ім'я члена клубу якоку необхідно додати тваринку");
        Person person = new Person(new Scanner(System.in).nextLine());
        List<Animal> memberAnimals = zooMap.get(person);
        if (memberAnimals == null) {
            System.out.println("Члена з таким ім'ям немає в клубі");
            return;
        }
        memberAnimals.add(new AnimalCreator().createAnimal());
        System.out.println("Додано нову тваринку члену клубу");
    }

    public void removeAnimalFromPerson() {
        System.out.println("Введіть ім'я члена клубу в якого портібно прибрати тваринку");
        Person person = new Person(new Scanner(System.in).nextLine());
        if (!zooMap.containsKey(person)) {
            System.out.println("Члена з таким ім'ям немає в клубі");
            return;
        }
        List<Animal> memberAnimals = zooMap.get(person);
        if (memberAnimals.isEmpty()) {
            System.out.println("У цього учаника клубу немає тваринок");
            return;
        }
        System.out.println("У цього члена клубу є наступні тваринки");
        for (Animal memberAnimal : memberAnimals) {
            System.out.print(memberAnimal.toString());
        }
        System.out.println("З яким ім'ям траринку потрібно видалити?");
        String animalName = new Scanner(System.in).nextLine();
        for (Animal memberAnimal : memberAnimals) {
            if (animalName.equalsIgnoreCase(memberAnimal.getAnimalName())) {
                memberAnimals.remove(memberAnimal);
                System.out.println("Тваринку видалено");
                return;
            }
        }
        System.out.println("Тваринки з таким імїям немає у цього учасника");
    }

    public void removePerson() {
        System.out.println("Введіть ім'я члена клубу якого потрібно видалити");
        Person person = new Person(new Scanner(System.in).nextLine());
        if (zooMap.remove(person) == null) {
            System.out.println("Учасника з таким ім'ям немає в клубі");
            return;
        }
        System.out.println("Учасника успішно видалено з клубу");
    }

    public void removeAnimalFromAll(){

    }

    public void showZooClub() {
        for (Person person : zooMap.keySet()) {
            System.out.println(person.toString() + zooMap.get(person).toString());
        }
    }
}
