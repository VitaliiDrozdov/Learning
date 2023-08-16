package zooClub.uIMenu;

import zooClub.ZooClub;

public class ExitProgram implements UIMenu {
    @Override
    public void action(ZooClub zooClub) {
        System.exit(7);
    }

    @Override
    public int actionCode() {
        return 7;
    }
}
