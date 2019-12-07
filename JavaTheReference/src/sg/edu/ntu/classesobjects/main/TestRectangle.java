package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("r1 : "+r1.toString());
        r1.setLength(12);
        r1.setWidth(8);
        System.out.println("r1 após alterações : "+r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Rectangle r2 = new Rectangle(18,20);
        System.out.println("r1 : "+r2.toString());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
