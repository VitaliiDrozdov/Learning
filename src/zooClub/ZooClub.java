package zooClub;

import zooClub.animal.Animal;
import zooClub.animal.AnimalCreator;

import java.io.Serializable;
import java.util.*;

public class ZooClub implements Serializable {
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
        System.out.println("Введіть ім'я члена клубу якому необхідно додати тваринку");
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
        System.out.println("Введіть ім'я члена клубу в якого портібно видалити тваринку");
        Person person = new Person(new Scanner(System.in).nextLine());
        if (!zooMap.containsKey(person)) {
            System.out.println("Члена з таким ім'ям немає в клубі");
            return;
        }
        List<Animal> memberAnimals = zooMap.get(person);
        if (memberAnimals.isEmpty()) {
            System.out.println("У цього члена клубу немає тваринок");
            return;
        }
        System.out.println("У цього члена клубу є наступні тваринки");
        for (Animal memberAnimal : memberAnimals) {
            System.out.print(memberAnimal.toString());
        }
        System.out.println("Траринку з яким ім'ям потрібно видалити?");
        String animalName = new Scanner(System.in).nextLine();
        for (Animal memberAnimal : memberAnimals) {
            if (animalName.equalsIgnoreCase(memberAnimal.getAnimalName())) {
                memberAnimals.remove(memberAnimal);
                System.out.println("Тваринку видалено");
                return;
            }
        }
        System.out.println("Тваринки з таким ім'ям немає у цього члена клубу");
    }

    public void removePerson() {
        System.out.println("Введіть ім'я члена клубу якого потрібно видалити");
        Person person = new Person(new Scanner(System.in).nextLine());
        if (zooMap.remove(person) == null) {
            System.out.println("Члена з таким ім'ям немає в клубі");
            return;
        }
        System.out.println("Члена успішно видалено з клубу");
    }

    public void removeAnimalFromAll() {
        System.out.println("Тваринку якого виду ви хочите видалити в усіх членів клбу?\n" +
                "Виберіть один з наступних типів:\n" +
                "1 - Кіт, 2 - Пес, 3 - Дегу, 4 - Черепаха, 5- Папуга, 6 - Рибка, 7 - інші.");
        Integer animalCode = new Scanner(System.in).nextInt();
        if (animalCode < 1 || animalCode > 7) {
            System.out.println("Хибний ввід :(");
            return;
        }
        boolean animalTypeNotExist = true;
        for (Person person : zooMap.keySet()) {
            List<Animal> memberAnimals = zooMap.get(person);
            for (Animal animal : memberAnimals) {
                if (animal.getAnimalType().getAnimalCode().equals(animalCode)) {
                    memberAnimals.remove(animal);
                    animalTypeNotExist = false;
                }
            }
        }
        if (animalTypeNotExist) {
            System.out.println("Тваринки цього типу немає в жодного члена клубу");
        } else {
            System.out.println("Тваринок обраного типу відалено у всіх членів клубу");
        }
    }

    public void showZooClub() {
        if (zooMap.isEmpty()) {
            System.out.println("Зооклуб наразі порожній");
            return;
        }
        for (Person person : zooMap.keySet()) {
            if (zooMap.get(person).isEmpty()) {
                System.out.println(person.toString() + " поки немає тваринок");
            } else {
                System.out.println(person.toString() + " має наступних тваринок " + zooMap.get(person).toString());
            }
        }
    }

//    public Map<Person, List<Animal>> getZooMap() {
//        return zooMap;
//    }
}
