package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.MyDate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1.toString2());             // Tuesday 28 Feb 2012
        System.out.println(d1.nextDay().toString2());   // Wednesday 29 Feb 2012
        System.out.println(d1.nextDay().toString2());   // Thursday 1 Mar 2012
        System.out.println(d1.nextMonth().toString2()); // Sunday 1 Apr 2012
        System.out.println(d1.nextYear().toString2());  // Monday 1 Apr 2013

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2.toString2());                 // Monday 2 Jan 2012
        System.out.println(d2.previousDay().toString2());   // Sunday 1 Jan 2012
        System.out.println(d2.previousDay().toString2());   // Saturday 31 Dec 2011
        System.out.println(d2.previousMonth().toString2()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear().toString2());  // Tuesday 30 Nov 2010

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear().toString2());  // Monday 28 Feb 2011
    }
}
