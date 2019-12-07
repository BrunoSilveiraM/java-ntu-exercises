package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());

        Circle c2 = new Circle(5.25);
        System.out.println(c2.toString());

        Circle c3 = new Circle();
        c3.setColor("Blue");
        c3.setRadius(2.25);
        System.out.println(c3.toString());

        Circle c4 = new Circle(6.25,"Yellow");
        c4.setColor("Green");
        c4.setRadius(15.4222);
        System.out.println(c4.toString());
    }
}
