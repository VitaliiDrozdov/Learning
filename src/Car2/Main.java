package Car2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Red", "Audi", 18, 10, "green");
        SteeringWheel steeringWheel = new SteeringWheel(12, "green");
        System.out.println(steeringWheel.toString());


    }
}
