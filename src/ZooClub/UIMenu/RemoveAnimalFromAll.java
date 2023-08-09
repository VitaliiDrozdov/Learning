package ZooClub.UIMenu;

import ZooClub.ZooClub;

public class RemoveAnimalFromAll implements UIMenu {
    @Override
    public void action(ZooClub zooClub) {
        zooClub.removeAnimalFromAll();
    }

    @Override
    public int actionCode() {
        return 5;
    }
}
