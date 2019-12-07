package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyDate;

public class TestDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(3,13, 5);
        System.out.println(d1.toString());
        d1.setDate(2,2,7);
        System.out.println(d1.toString());
        d1.setMonth(2);
        System.out.println(d1.toString());
        d1.setYear(5);
        System.out.println(d1.toString());
        System.out.println(d1.toString2());

    }
}
