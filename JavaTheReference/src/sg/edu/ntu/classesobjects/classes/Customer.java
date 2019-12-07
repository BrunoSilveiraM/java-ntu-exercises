package sg.edu.ntu.classesobjects.classes;

public class Customer {
    private int ID;
    private String name;
    private int discount;
    private char gender;

    public Customer(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    public Customer(int ID, String name, int discount) {
        this(ID,name);
        this.discount = discount;
    }

    public Customer(int ID, String name, int discount, char gender) {
        this(ID,name,discount);
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public char getGender() {
        return gender;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return "Name "+name+"("+ID+")";
    }
}
