package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.Account;
import sg.edu.ntu.classesobjects.classes.Customer;

public class TestAccount {
    public static void main(String[] args) {
        Customer c1 = new Customer(10245,"Regina Phalangie");
        Account a1 = new Account("451230-ijskdm", c1, 213500);
        System.out.println(a1.getBalance());
        System.out.println(a1.getID());
        System.out.println(a1.toString());
        System.out.println(a1.withDraw(213500));
        System.out.println(a1.withDraw(20));
        a1.setBalance(213500);
        System.out.println(a1.deposit(500));
        Customer c2 = new Customer(10245,"Rachel Green");
        Account a2 = new Account("##4934-gfklm", c2, 2300);
        System.out.println(a1.transferTo(a2,2000));
    }
}
