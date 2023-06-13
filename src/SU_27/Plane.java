package SU_27;

import java.util.Random;

public abstract class Plane {
    Random random = new Random();
    Management management = new Management();

    private final double length;
    private final double width;
    private final double weight;

    public Plane(double length, double width, double weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void engineStart() {
        System.out.println("Готовність до зльоту через " + random.nextInt(20, 89) + " с.");
    }

    public void takeoff() {
        System.out.println("На повному баку літак зможе подолати " + random.nextDouble(0, 1001) + " км.");
    }

    public void landing() {
        System.out.println("Літак йде на посадку");
    }

    public void movementUp() {
        management.movementUp();
    }

    public void movementDown() {
        management.movementDown();
    }

    public void movementRight() {
        management.movementRight();
    }

    public void movementLeft() {
        management.movementLeft();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }
}
