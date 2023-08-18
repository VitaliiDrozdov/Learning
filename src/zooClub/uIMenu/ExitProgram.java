package zooClub.uIMenu;

import zooClub.ZooClub;

public class ExitProgram implements UIMenuAction {
    @Override
    public void action(ZooClub zooClub) {
        System.exit(8);
    }

    @Override
    public int actionCode() {
        return 8;
    }
}
