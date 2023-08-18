package zooClub.uIMenu;

import zooClub.ZooClub;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveZooClub implements UIMenuAction {
    @Override
    public void action(ZooClub zooClub) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("zooClub.data"));
            objectOutputStream.writeObject(zooClub);
            objectOutputStream.close();
        } catch (Exception e) {
        }
    }

    @Override
    public int actionCode() {
        return 7;
    }
}
