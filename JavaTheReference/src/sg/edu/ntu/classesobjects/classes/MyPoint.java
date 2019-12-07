package sg.edu.ntu.classesobjects.classes;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[]getXY() {
        return new int[]{x,y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+x+","+y+")";
    }

    public double distance(int x, int y) {
        double dis;
        dis = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y),2));
        return dis;
    }

    public double distance(MyPoint another){
        double dis;
        dis = Math.sqrt(Math.pow((another.x - x), 2) + Math.pow((another.y - y),2));
        return dis;
    }

    public double distance(){
        double dis;
        dis = Math.sqrt(Math.pow((x), 2) + Math.pow((y),2));
        return dis;
    }




}
