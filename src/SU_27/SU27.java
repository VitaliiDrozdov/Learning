package SU_27;

public class SU27 extends Plane implements SpecialFeatures {
    private int maxSpeed;
    private String color;

    public SU27(int maxSpeed, String color) {
        super(21.9, 14.7, 16.38);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void afterburner() {
        System.out.println("Швидкість літака " + random.nextInt(maxSpeed + 1, maxSpeed + 101) + " км/год.");
    }

    @Override
    public void stealth() {
        System.out.println("Літака не видно " + random.nextInt(5, 21) + " с.");
    }

    @Override
    public void nuclearStrike() {
        System.out.println("Скидання " + random.nextInt(1, 11) + " ядерних зарядів.");
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
}
