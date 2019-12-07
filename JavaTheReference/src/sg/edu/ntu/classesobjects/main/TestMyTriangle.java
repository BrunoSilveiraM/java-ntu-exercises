package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyPoint;
import sg.edu.ntu.classesobjects.classes.MyTriangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2,2);
        MyPoint p2 = new MyPoint(2,2);
        MyPoint p3 = new MyPoint(2,2);
        MyTriangle t1 = new MyTriangle(p1,p2,p3);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
        System.out.println(t1.toString());
    }
}
