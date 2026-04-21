package com.sunbeam;

public class EmployeeTest {
    public static void main(String[] args) {
     
        Employee emp1 = new Employee("Rahul", "Sharma", 5000.0);
        Employee emp2 = new Employee("Anita", "Patil", 6000.0);

 
        System.out.println(" Initial Yearly Salaries ");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getYearlySalary());

       
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

    
        System.out.println("\n After 10% Raise ");
        System.out.printf("%s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}
