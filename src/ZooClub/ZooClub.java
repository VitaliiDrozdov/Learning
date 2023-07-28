package ZooClub;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Animal>> zooMap = new HashMap();

    public ZooClub() {
    }

    public boolean addPerson() {
        Person person = new PersonCreator().createPerson();
        if (zooMap.containsKey(person)) {
            return false;
        }
        List<Animal> animalList = new LinkedList<>();
        zooMap.put(person, animalList);
        return true;
    }

    public boolean addAnimalToPerson() {
        System.out.println("Введіть ім'я члена клубу якоку необхідно додати тваринку");
        Person person = new Person(new Scanner(System.in).nextLine(), 0);
        List<Animal> memberAnimals = zooMap.get(person);
        if (memberAnimals == null) {
            return false;
        }
        memberAnimals.add(new AnimalCreator().createAnimal());
        return true;
    }

    public void showAllZooClub() {
        for (Person person : zooMap.keySet()) {
            System.out.println(person.toString() + zooMap.get(person).toString());
        }

    }

}
