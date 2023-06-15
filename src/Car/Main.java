package Car;

public class Main {

    public static void main(String[] args) {

        Car audi = new Car("Audi");
        Car bentley = new Car("Bentley");
        Car chevrolet = new Car("Chevrolet");

        Driver vitalii = new Driver("Vitalii");
        Driver lyubomir = new Driver("Lyubomir");
        Driver denys = new Driver("Denys");

        audi.driver = vitalii;
        bentley.getIntoCar(lyubomir);
        chevrolet.getIntoCar(denys);

        audi.getInfo();
        audi.drive();
        audi.getInfo();
        audi.getOutCar();
        audi.getInfo();
    }
}
