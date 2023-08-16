package zooClub.uIMenu;

import zooClub.ZooClub;

public class AddPerson implements UIMenu {
    @Override
    public void action(ZooClub zooClub) {
        zooClub.addPerson();
    }

    @Override
    public int actionCode() {
        return 1;
    }
}
