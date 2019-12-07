package sg.edu.ntu.classesobjects.classes;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        if(imag > 0){
            return "("+real+"+"+imag+"i"+")";
        }
        return "("+real+imag+"i"+")";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        double epsilon = 10E-8;
        return (this.real - real < epsilon && this.imag - imag < epsilon);
    }

    public boolean equals(MyComplex another) {
        double epsilon = 10E-8;
        return (real - another.real < epsilon && imag - another.imag < epsilon);
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public double argument() {
        return Math.atan2(this.imag,this.real);
    }

    public MyComplex add(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real,imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real,imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double tempImag, tempReal;
        tempImag = real * right.imag + imag * right.real;
        tempReal = real * right.real - imag * right.imag;
        real = tempReal;
        imag = tempImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double divisor;
        MyComplex dividendo = multiply(right.conjugate());// multiplica o this pelo right conjugado.
        divisor = right.real * right.real + right.imag * right.imag;
        if(divisor != 0){
            real = dividendo.real / divisor; // divide a parte real.
            imag = dividendo.imag / divisor; // divide a parte imaginária.
        }
        return this;
    }

    public MyComplex conjugate() {
        imag*=-1;
        return this;
    }


}
