package Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Tire> tireSet = new HashSet<>();

        tireSet.add(new Tire("KRYPTOTAL", 75));
        tireSet.add(new Tire("ARGOTAL", 80));
        tireSet.add(new Tire("HYDROTAL", 70));
        tireSet.add(new Tire("XYNOTAL", 83));

        for (Tire t : tireSet) {
            System.out.println(t.toString());
        }
        System.out.println();

        List<Tire> tires = new ArrayList<>();
        tires.addAll(tireSet);
        tires.sort(null);

        for (Tire tire : tires) {
            System.out.println(tire.toString());
        }
        System.out.println();

        TirePriceComparator tirePriceComparator = new TirePriceComparator();
        tires.sort(tirePriceComparator);

        for (Tire tire : tires) {
            System.out.println(tire.toString());
        }
    }
}
