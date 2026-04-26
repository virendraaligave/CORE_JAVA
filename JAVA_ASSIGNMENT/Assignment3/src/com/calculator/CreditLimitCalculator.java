package com.calculator;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Beginning Balance: ");
        int beginningBalance = sc.nextInt();

        System.out.print("Enter Total Charges: ");
        int charges = sc.nextInt();

        System.out.print("Enter Total Credits: ");
        int credits = sc.nextInt();

        System.out.print("Enter Credit Limit: ");
        int creditLimit = sc.nextInt();

        
        int newBalance = beginningBalance + charges - credits;

        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Within credit limit");
        }

        sc.close();
    }
}