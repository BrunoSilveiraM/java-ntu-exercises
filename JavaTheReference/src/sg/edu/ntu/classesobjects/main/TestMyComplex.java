package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyComplex;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex m1 = new MyComplex(7,9);
        MyComplex m2 = new MyComplex(3,4);
        /* Testes getters,setters,toString,conjugate.
        System.out.println(m1.toString());
        System.out.println(m1.conjugate());
        System.out.println(m1.getImag());
        System.out.println(m1.getReal());
        m1.setImag(8);
        m1.setReal(12);
        System.out.println(m1.getImag());
        System.out.println(m1.toString());
        m1.setValue(3,12);
        System.out.println(m1.toString());
         */
        System.out.println(m1.subtractNew(m2));
        System.out.println(m1.subtract(m2));
    }
}
