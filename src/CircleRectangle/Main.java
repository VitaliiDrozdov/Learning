package CircleRectangle;

public class Main {
    public static void main(String[] args) {

        // Rectangle

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setLength(7);
        firstRectangle.setWidth(11);

        Rectangle secondRectangle = new Rectangle(13, 17);

        firstRectangle.printArea();
        secondRectangle.printPerimeter();

        // Circle

        Circle firstCircle = new Circle(3.55, 7.1);

        Circle secondCircle = new Circle();
        secondCircle.diameter = 7.62d;

        firstCircle.circleArea();
        secondCircle.circleLength();
    }
}
