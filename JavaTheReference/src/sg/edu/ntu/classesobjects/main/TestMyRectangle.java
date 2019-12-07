package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyPoint;
import sg.edu.ntu.classesobjects.classes.MyRectangle;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(5,7);
        MyRectangle r1 = new MyRectangle(p1);
        System.out.println("r1 = "+r1.toString());
        r1.setLength(2);
        r1.setWidth(4);
        System.out.println("r1 após alterações\n"+r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        MyRectangle r2 = new MyRectangle(8,2);
        System.out.println("**************");
        System.out.println("r2 : "+r2.toString());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
    }
}
