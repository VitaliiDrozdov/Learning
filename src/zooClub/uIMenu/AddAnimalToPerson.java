package zooClub.uIMenu;

import zooClub.ZooClub;

public class AddAnimalToPerson implements UIMenu {
    @Override
    public void action(ZooClub zooClub) {
        zooClub.addAnimalToPerson();
    }

    @Override
    public int actionCode() {
        return 2;
    }
}
