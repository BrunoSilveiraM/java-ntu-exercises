package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyTime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime m1 = new MyTime(23,59,25);
        System.out.println(m1.nextHour());

    }
}
