package zooClub;

import zooClub.uIMenu.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();
        boolean newZooClub = true;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("zooClub.data"));
            zooClub = (ZooClub) objectInputStream.readObject();
            newZooClub = false;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }

        if (newZooClub) {
            System.out.println("Вітаємо!\nСтворено новий Зооклуб");
        } else {
            System.out.println("Вітаємо!\nЗооклуб успішно завантажено");
        }

        new UIMenu().runUIMenu(zooClub);
    }
}
