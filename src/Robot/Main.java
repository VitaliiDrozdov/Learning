package Robot;

public class Main {

    public static void main(String[] args){

        Robot[] robotsBand = new Robot[5];

        robotsBand[0] = new Robot();
        robotsBand[1] = new CoffeRobot();
        robotsBand[2] = new RobotDancer();
        robotsBand[3] = new RobotCoocker();

        for (int i = 0; i < robotsBand.length; i++) {
            if(robotsBand[i] != null){
                robotsBand[i].work();
            }
        }
    }
}
