/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exSelfCheckout {
    public static void main (String[] args)
    {
        final double constTax = 5.5/100;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        String item1 = sc.nextLine();
        System.out.println("Enter the quantity of item 1: ");
        String quant1 = sc.nextLine();

        System.out.println("Enter the price of item 2: ");
        String item2 = sc.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        String quant2 = sc.nextLine();

        System.out.println("Enter the price of item 3: ");
        String item3 = sc.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        String quant3 = sc.nextLine();

        //Conversion from String to double and integer
        double price1 = Double.parseDouble(item1);
        int q1 = Integer.parseInt(quant1);
        double price2 = Double.parseDouble(item2);
        int q2 = Integer.parseInt(quant2);
        double price3 = Double.parseDouble(item3);
        int q3 = Integer.parseInt(quant3);
        double subtot = (price1*q1)+(price2*q2)+(price3*q3); //Subtotal of all the items
        double tax = subtot*constTax; //Tax to applied on the subtotal
        double total = subtot+tax; //Final amount with the tax

        System.out.printf("Subtotal: $%.2f \n", subtot);
        System.out.printf("Tax: $%.2f \n", tax);
        System.out.printf("Total: $%.2f \n", total);
    }
}
