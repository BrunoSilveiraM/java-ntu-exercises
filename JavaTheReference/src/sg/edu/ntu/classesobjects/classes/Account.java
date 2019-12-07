package sg.edu.ntu.classesobjects.classes;

public class Account {
    private String id;
    private Customer customer;
    private double balance;

    public Account() {
        double balance = 0.0;
    }

    public Account(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public Account(String id, Customer customer, double balance) {
        this(id,customer);
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format(customer.toString()+"%.2f",balance);
    }
    public String getCustomerName() {
        return customer.getName();
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withDraw(double amount) {
        if(amount <= balance){
            return balance -= amount;
        }else{
            System.out.println("Amount withdrawn exceeds balance!");
            return balance;
        }
    }

    public double transferTo(Account another, double amount) {
        if(amount <= this.balance){
            this.balance -= amount;
            return another.balance += amount;
        }else{
            System.out.println("Amount exceed balance");
            return this.balance;
        }
    }
}
