package com.sunbeam;
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("1234", "Electric Drill", 2, 4500.00);

        Invoice inv2 = new Invoice("5678", "Hammer", -5, -20.0);

        System.out.println(" Invoice 1 Details");
        System.out.println("Part Number: " + inv1.getPartNumber());
        System.out.println("Description: " + inv1.getPartDescription());
        System.out.println("Quantity: " + inv1.getQuantity());
        System.out.println("Price per Item: " + inv1.getPricePerItem());
        System.out.println("Total Amount: " + inv1.getInvoiceAmount());

        System.out.println("\nInvoice 2 Details ");
        System.out.println("Part Number: " + inv2.getPartNumber());
        System.out.println("Description: " + inv2.getPartDescription());
        System.out.println("Quantity: " + inv2.getQuantity());
        System.out.println("Price: " + inv2.getPricePerItem());
        System.out.println("Total Amount: " + inv2.getInvoiceAmount());
    }
}
