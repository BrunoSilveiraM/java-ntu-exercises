package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        /*
         declara um array do tipo de objeto MyPoint com 10 posições.
         onde points irá ter tipos de objetos MyPoint[0][1]...[9].
         */
        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i < points.length; i++){
            points[i] = new MyPoint(i + 1, i + 1);
        }

        for(int i = 0; i < points.length; i++){
            System.out.println(points[i].toString());
        }



    }
}
