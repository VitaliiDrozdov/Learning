package ZooClub;

import ZooClub.UIMenu.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        Map<Integer, UIMenu> codeUIMenu = new HashMap<>();
        codeUIMenu.put(1, new AddPerson());
        codeUIMenu.put(2, new AddAnimalToPerson());
        codeUIMenu.put(3, new RemoveAnimalFromPerson());
        codeUIMenu.put(4, new RemovePerson());
        codeUIMenu.put(5, new RemoveAnimalFromAll());
        codeUIMenu.put(6, new ShowZooClub());
        codeUIMenu.put(7, new ExitProgram());


        codeUIMenu.get(1).action(zooClub);
        codeUIMenu.get(1).action(zooClub);
        codeUIMenu.get(2).action(zooClub);
        codeUIMenu.get(2).action(zooClub);
        codeUIMenu.get(5).action(zooClub);
        codeUIMenu.get(6).action(zooClub);
        codeUIMenu.get(7).action(zooClub);


    }
}
