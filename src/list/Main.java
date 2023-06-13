package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList(0);

        System.out.println(myArrayList.isEmpty());
        myArrayList.add(1);
        myArrayList.print();
        myArrayList.remove(0);
        myArrayList.print();
        myArrayList.add(2);
        myArrayList.print();
        myArrayList.add(3);
        myArrayList.print();
        myArrayList.add(4);
        myArrayList.print();
        myArrayList.add(5);
        myArrayList.print();
        myArrayList.remove(3);
        myArrayList.print();
        myArrayList.add(6);
        myArrayList.print();
        myArrayList.add(7);
        myArrayList.print();
        myArrayList.remove(2);
        myArrayList.print();
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
        System.out.println("test");



    }

}
