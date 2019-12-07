package sg.edu.ntu.classesobjects.classes;

public class MyPolinomial {
    private double[] coeffs;

    public MyPolinomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public MyPolinomial(int tamanho){
        this.coeffs = new double[tamanho + 1];
    }

    public int getDegree(){
        return (this.coeffs.length - 1);
    }

    public String toString(){
        int i;
        int deg = this.getDegree();
        StringBuilder poly = new StringBuilder();
        for(i = 0; i <= deg; i++){
            if(i == deg){
                poly.append(coeffs[i]);
            }else{
                poly.append(coeffs[i]+"x"+"^"+(deg - i)+"+");

            }
        }
        return poly.toString();
    }

    public double evaluate (double x){
        int i, sum = 0;
        for(i = getDegree() - 1; i >= 0; i--){
            sum+=coeffs[i] * Math.pow(x,getDegree());
        }
        return sum;
    }

    public MyPolinomial add (MyPolinomial right){
        int i;
        int degthis = this.getDegree();
        int degright = right.getDegree();
        if(this.getDegree() > right.getDegree()){
            for(i = 0; i < this.getDegree(); i++){
                if((this.getDegree() - degthis) == (right.getDegree() - degright)){
                    this.coeffs[degthis]+=right.coeffs[degright];
                    degthis--;
                    degright--;
                }
            }
        }else if(this.getDegree() < right.getDegree()) {
            for (i = 0; i < right.getDegree(); i++) {
                if ((this.getDegree() - degthis) == (right.getDegree() - degright)) {
                    right.coeffs[degright] += this.coeffs[degthis];
                    degthis--;
                    degright--;
                    return right;
                }
            }
        }else if(this.getDegree() == right.getDegree()){
            for(i = 0; i <= right.getDegree(); i++){
                this.coeffs[i] += right.coeffs[i];
            }
        }
        return this;
    }

    public MyPolinomial multiply(MyPolinomial right){
        int i, j;
        MyPolinomial multi = new MyPolinomial(this.getDegree() + right.getDegree());
        for(i = 0; i <= this.getDegree(); i++){
            for(j = 0; j <= right.getDegree(); j++){
                multi.coeffs[i + j] += (this.coeffs[i] * right.coeffs[j]);
            }
        }
        return multi;
    }

}
