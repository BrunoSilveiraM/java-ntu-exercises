package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyPolinomial;

public class TestMyPolinomial {
    public static void main(String[] args) {
        MyPolinomial m1 = new MyPolinomial(2,3);
        MyPolinomial m2 = new MyPolinomial(4,5,6);

        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m1.multiply(m2));

    }
}
