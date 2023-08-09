package ZooClub.UIMenu;

import ZooClub.ZooClub;

public class RemoveAnimalFromPerson implements UIMenu {
    @Override
    public void action(ZooClub zooClub) {
        zooClub.removeAnimalFromPerson();
    }

    @Override
    public int actionCode() {
        return 3;
    }
}
