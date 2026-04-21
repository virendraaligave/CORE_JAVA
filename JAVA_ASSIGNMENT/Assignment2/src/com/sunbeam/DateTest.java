package com.sunbeam;

public class DateTest {
    public static void main(String[] args) {

        Date myDate = new Date(12, 31, 2024);

        System.out.print("The initial date is: ");
        myDate.displayDate();

        myDate.setMonth(1);
        myDate.setDay(1);
        myDate.setYear(2025);

        System.out.println("\n After Modification ");
        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Day: " + myDate.getDay());
        System.out.println("Year: " + myDate.getYear());
        
        System.out.print("The updated date is: ");
        myDate.displayDate();
    }
}
