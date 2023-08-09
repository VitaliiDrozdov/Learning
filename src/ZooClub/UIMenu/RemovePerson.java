package ZooClub.UIMenu;

import ZooClub.ZooClub;

public class RemovePerson implements UIMenu {
    @Override
    public void action(ZooClub zooClub) {
        zooClub.removePerson();
    }

    @Override
    public int actionCode() {
        return 4;
    }
}
