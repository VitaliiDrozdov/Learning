package ZooClub.UIMenu;

import ZooClub.ZooClub;

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
