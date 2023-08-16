package zooClub.uIMenu;

import zooClub.ZooClub;

public class ShowZooClub implements UIMenu {
    @Override
    public void action(ZooClub zooClub) {
        zooClub.showZooClub();
    }

    @Override
    public int actionCode() {
        return 7;
    }
}
