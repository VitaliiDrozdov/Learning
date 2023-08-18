package zooClub.uIMenu;

import zooClub.ZooClub;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UIMenu {
    private Map<Integer, UIMenuAction> codeUIMenu = new HashMap<>();


    public UIMenu() {
        codeUIMenu.put(1, new AddPerson());
        codeUIMenu.put(2, new AddAnimalToPerson());
        codeUIMenu.put(3, new RemoveAnimalFromPerson());
        codeUIMenu.put(4, new RemovePerson());
        codeUIMenu.put(5, new RemoveAnimalFromAll());
        codeUIMenu.put(6, new ShowZooClub());
        codeUIMenu.put(7, new SaveZooClub());
        codeUIMenu.put(8, new ExitProgram());
    }

    public void runUIMenu(ZooClub zooClub) {
        while (true) {
            System.out.println("Виберіть необхідну дію:\n" +
                    "1 - Добади члена клубу;\n" +
                    "2 - Додати тваринку до члена клубу\n" +
                    "3 - Видалити тваринку в члена клубу\n" +
                    "4 - Видалити члена клубу\n" +
                    "5 - Видалити тваринку у всіх членів клубу\n" +
                    "6 - Показати увесь зооклуб\n" +
                    "7 - Зберегти Зооклуб\n" +
                    "8 - Вийти з програми");

            codeUIMenu.get(new Scanner(System.in).nextInt()).action(zooClub);
            System.out.println();
        }
    }
}
