package Car;

public class Engine {

    long odometer;

    public Engine() {
        odometer = 0;
    }

    public void drive (String brand){
        System.out.println("Машина " + brand + " їде");
        odometer++;
    }

}
