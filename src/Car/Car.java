package Car;

public class Car {

    Driver driver;
    private Engine engine;
    private String brand;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    public void getIntoCar(Driver driver){
        this.driver = driver;
        System.out.println(this.driver.name + " сів до " + this.brand);
    }

    public void getOutCar(){
        System.out.println(this.driver.name + " вийшов з " + this.brand);
        this.driver = null;
    }

    public void drive(){
        this.engine.drive(this.brand);
    }

    public void getInfo(){
        if (this.driver != null) {
            System.out.println(this.driver.name +
                    " сидить у " +
                    this.brand +
                    " яка проїхала " +
                    this.engine.odometer + " км.");
        } else {
            System.out.println("В " +
                    this.brand +
                    " ніхто не сидить і вона проїхала " +
                    this.engine.odometer + " км.");
        }
    }
}
