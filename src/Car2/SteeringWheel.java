package Car2;

public class SteeringWheel {
    private int size;

    private String color;

    public SteeringWheel(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
