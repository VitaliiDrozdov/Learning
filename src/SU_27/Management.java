package SU_27;

import java.util.Random;

public class Management {
    Random random = new Random();

    public void movementUp() {
        System.out.println("Літак перемістився вгору на " + random.nextInt(1, 101) + " км.");
    }

    public void movementDown() {
        System.out.println("Літак перемістився вниз на " + random.nextInt(1, 101) + " км.");
    }

    public void movementRight() {
        System.out.println("Літак перемістився вправо на " + random.nextFloat(1, 101) + " км.");
    }

    public void movementLeft() {
        System.out.println("Літак перемістився вліво на " + random.nextFloat(1, 101) + " км.");
    }
}
