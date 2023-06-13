package Car2;

public class Car {
    private String color;
    private String brand;
    private Wheel wheel;
    private SteeringWheel steeringWheel;

    public Car(String color, String brand, int wheelDiameter, int size, String sWcolor) {
        this.color = color;
        this.brand = brand;
        this.wheel = new Wheel(wheelDiameter);
        this.steeringWheel = new SteeringWheel(size, sWcolor);
    }
    
}
