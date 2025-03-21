
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_4 {
    
// File:        Applprog_4.java
// Project:     Assignments
// Assignment:  #4
// Programmer:  Nelsa Hopper
// Date:        9/13/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Subtotal, Discount Rates, And Sales Tax(but with printf)

public static void main(String[] args){
    
    System.out.println("    Assignment #3");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
Scanner scan = new Scanner(System.in);
    float subtotal, discount, sales, newsales, newdiscount, newsubtotal, total;
    System.out.print("Enter subtotal : ");
    subtotal = scan.nextFloat();
    System.out.print("Enter discount rate % : ");
    discount = scan.nextFloat();
    System.out.print("Enter sales tax rate % : ");
    sales = scan.nextFloat();
    
    System.out.println("");
    System.out.printf("%nSubtotal = $ %.2f", subtotal);
    System.out.printf("%nDiscount Rate = %.2f %%", discount);
    System.out.printf("%nSales Tax Rate = %.2f %%", sales); 
    newdiscount = (discount * .01f) * subtotal;
    newsubtotal = subtotal - newdiscount;
    newsales = (sales * .01f) * newsubtotal;
    total = newsubtotal + newsales;
    System.out.printf("%nDiscount = $ %.2f", newdiscount);
    System.out.printf("%nSubtotal = $ %.2f", newsubtotal);
    System.out.printf("%nSales Tax = $ %.2f", newsales);
    System.out.printf("%nTotal = $ %.2f%n",total);
}    
}
