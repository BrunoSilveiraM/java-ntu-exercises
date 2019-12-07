package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.InvoiceItem;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("84596485-fkljsg", "Stapler",200,1.14);
        System.out.println("Total = "+i1.getTotal());
        System.out.println(i1.toString());
    }
}
