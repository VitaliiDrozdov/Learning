package Car2;

public class Wheel {
    private int diametr;

    public Wheel(int diameter) {
        this.diametr = diameter;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public void increaseWheelDiameter(int multiplier){
        this.diametr *= multiplier;
    }
}
