package CircleRectangle;

public class Rectangle {

    private int length;
    private int width;
    public Rectangle() {
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void printArea(){
        int area = this.length * this.width;
        System.out.println("Area of rectangle are " + area + ".");
    }
    public void printPerimeter(){
        int perimeter = (this.length + this.width) * 2;
        System.out.println("Perimeter of rectangle are " + perimeter + ".");
    }
    public int getArea(){
        int area = this.length * this.width;
        return area;
    }
    public int getPerimeter(){
        int perimeter = (this.length + this.width) * 2;
        return perimeter;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}
