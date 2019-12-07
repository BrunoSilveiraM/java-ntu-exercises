package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(31645197, "Chandler", "Muriel Bing", 20000);
        e1.setSalary(30000);
        System.out.println("Chandler Bing seu salário de presidente : "+e1.getSalary());
        e1.raiseSalary(15);
        System.out.println("Chandler Bing seu salário com 15% de aumento : "+e1.getSalary());
        e1.getAnnualSalaray();
        System.out.println("Chandler Bing seu salário anual : "+e1.getAnnualSalaray());
        System.out.println(e1.toString());
    }

}
