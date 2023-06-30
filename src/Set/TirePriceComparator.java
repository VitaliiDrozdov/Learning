package Set;

import java.util.Comparator;

public class TirePriceComparator implements Comparator<Tire> {
    @Override
    public int compare(Tire t1, Tire t2) {
        return t1.getPrice() - t2.getPrice();
    }
}
