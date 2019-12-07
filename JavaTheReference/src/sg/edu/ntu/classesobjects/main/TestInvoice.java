package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.Customer;
import sg.edu.ntu.classesobjects.classes.Invoice;

public class TestInvoice {
    public static void main(String[] args) {
        Customer c1 = new Customer(10245,"Regina Phalangie", 200);
        Invoice i1 = new Invoice(84564,c1,2335);
        System.out.println(i1.getAmount());
        System.out.println(i1.getAmountAfterDiscount());
        System.out.println(i1.getCustomer());
        System.out.println(i1.getCustomerName());
        System.out.println(i1.toString());
    }
}
