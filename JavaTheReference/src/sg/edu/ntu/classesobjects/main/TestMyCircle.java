package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyCircle;
import sg.edu.ntu.classesobjects.classes.MyPoint;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(2,3,5);
        MyPoint p1 = new MyPoint(2,3);
        MyCircle c3 = new MyCircle(p1,8);
        System.out.println("Raio c1 : "+c1.getRadius());
        System.out.println("Centro c1 : "+c1.getCenter());
        System.out.println("X de c1 : "+c1.getCenterX());
        System.out.println("Y de c1 : "+c1.getCenterY());
        System.out.println("XY de c1 : "+ Arrays.toString(c1.getCenterXY()));
        System.out.println(c1.toString());
        System.out.println("Área c1 = "+c1.getArea());
        System.out.println("Circunferência c1 = "+c1.getCircumference());
        c1.setCenter(p1);
        System.out.println("Center c1 após 1ª alteração : "+c1.getCenter());
        c1.setCenterX(8);
        System.out.println("X c1 após 2ª alteração : "+c1.getCenterX());
        c1.setCenterY(9);
        System.out.println("Y c1 após 3ª alteração : "+c1.getCenterY());
        c1.setCenterXY(5,4);
        System.out.println("Center c1 após 4ª alteração : "+Arrays.toString(c1.getCenterXY()));
        c1.setRadius(10);
        System.out.println("Raio c1 após 5ª alteração : "+c1.getRadius());
        System.out.println("Área c1 = "+c1.getArea());
        System.out.println("Circunferência c1 = "+c1.getCircumference());

    }
}
