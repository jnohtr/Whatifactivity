package com.company;

import java.util.Scanner;

public class Whatifactivity {

    public static void main(String[] args) {
	// write your code here
        // TODO code application logic here

        double tax, tax2, total;
        String name, lname;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "customer number: " );
        int number = keyboard.nextInt();

        System.out.print( "customer name: " );
        name = keyboard.next(); //Line String
        //name = keyboard.nextLine();

        System.out.print( "customer last name: " ); //lsdt
        lname = keyboard.next();

        System.out.print( "sales amount: " );
        double amount = keyboard.nextDouble();

        System.out.print( "a tax code, NRM	6%\n" +
                "NPF	0%\n" +
                "BIZ	4.5%: " );
        String code = keyboard.next();

        if (code.equals("NRM"))
            tax = 0.06;
        else if (code.equals("BIZ"))
            tax = 0.045;
        else
            tax = 0;

        tax2 = amount * tax;

        total = amount + tax2; //taxi2

        System.out.println(number +','+ name +',' +lname +',' + amount +','+ code +','+ tax +','+ tax2 +','+  total);

        System.out.println("Customer ID: " + number);
        System.out.println("Customer Name: " + name + " " + lname);
        System.out.println("Sales Amount: $" + amount);
        System.out.println("Tax Code: " + code);
        System.out.println("Tax : $ " + tax2);
        System.out.println("Total Amount Due: $" + total);

    }
}
