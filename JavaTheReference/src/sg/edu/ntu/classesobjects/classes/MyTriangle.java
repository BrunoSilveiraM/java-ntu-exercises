package sg.edu.ntu.classesobjects.classes;

public class MyTriangle {
    public MyPoint v1;
    public MyPoint v2;
    public MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "v1 = " + v1.toString() + "," + "v2 = " + v2.toString() + "," + "v3 = " + v3.toString();
    }

    public double getPerimeter() {
        double a, b, c, p;
        a = v1.distance(v2);
        b = v1.distance(v3);
        c = v2.distance(v3);
        p = a + b + c;
        return p;
    }

    public String getType() {
        double a, b, c, p;
        a = v1.distance(v2);
        b = v1.distance(v3);
        c = v2.distance(v3);
        if((a == b) && (a == c)){
            return "Equilateral";
        }
        if((a == b) || (b == c)){
            return "Isosceles";
        }
        return "Scalane";
    }

}
