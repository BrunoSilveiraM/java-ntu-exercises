package sg.edu.ntu.classesobjects.classes;

public class MyRectangle {
    private MyPoint p1;

    public MyRectangle(int length, int width ) {
        p1 = new MyPoint(length, width);
    }

    public MyRectangle(MyPoint lengthWidth) {
        p1 = lengthWidth;
    }

    public double getLength() {
        return p1.getX();
    }

    public void setLength(int length) {
        p1.setX(length);
    }

    public float getWidth() {
        return p1.getY();
    }

    public void setWidth(int width) {
        p1.setY(width);
    }

    public double getArea(){
        return p1.getX() * p1.getY();
    }

    public double getPerimeter(){
        return 2 * (p1.getX() + p1.getY());
    }

    public String toString(){
        return "Length = "+p1.getX()+" "+"Width = "+p1.getY();
    }
}
