package ZooClub;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();


        if (zooClub.addPerson()) {
            System.out.println("Додано нового члена клубу");
        } else {
            System.out.println("Член з таким ім'ям уже є у клубі");
        }
        if (zooClub.addPerson()) {
            System.out.println("Додано нового члена клубу");
        } else {
            System.out.println("Член з таким ім'ям уже є у клубі");
        }

        if (zooClub.addAnimalToPerson()) {
            System.out.println("Додано нову тваринку члену клубу");
        } else {
            System.out.println("Член з таким ім'ям немає у клубі");
        }if (zooClub.addAnimalToPerson()) {
            System.out.println("Додано нову тваринку члену клубу");
        } else {
            System.out.println("Член з таким ім'ям немає у клубі");
        }if (zooClub.addAnimalToPerson()) {
            System.out.println("Додано нову тваринку члену клубу");
        } else {
            System.out.println("Член з таким ім'ям немає у клубі");
        }
        zooClub.showAllZooClub();





    }
}
