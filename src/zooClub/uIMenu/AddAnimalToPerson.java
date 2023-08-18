package zooClub.uIMenu;

import zooClub.ZooClub;

public class AddAnimalToPerson implements UIMenuAction {
    @Override
    public void action(ZooClub zooClub) {
        zooClub.addAnimalToPerson();
    }

    @Override
    public int actionCode() {
        return 2;
    }
}
