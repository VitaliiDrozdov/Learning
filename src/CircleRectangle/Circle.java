package CircleRectangle;

public class Circle {

    double semidiameter;

    double diameter;

    private final double pi = 3.141592d;

    public Circle() {
    }

    public Circle(double semidiameter, double diameter) {
        this.semidiameter = semidiameter;
        this.diameter = diameter;
    }

    public void circleArea(){
        double circleArea = pi * this.semidiameter * this.semidiameter;
        System.out.println("Площа кола = " + circleArea + ".");
    }

    public void circleLength (){
        double circleLength = pi * this.diameter;
        System.out.println("Довжина кола = "+ circleLength + ".");
    }

}
