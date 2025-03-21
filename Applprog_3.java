
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_3 {
    
// File:        Applprog_3.java
// Project:     Assignments
// Assignment:  #3
// Programmer:  Nelsa Hopper
// Date:        9/13/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Subtotal, Discount Rates, And Sales Tax

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
    System.out.println("Subtotal = $" + subtotal);
    System.out.println("Discount Rate = " + discount);
    System.out.println("Sales Tax Rate = " + sales); 
    newdiscount = (discount * .01f) * subtotal;
    newsubtotal = subtotal - newdiscount;
    newsales = (sales * .01f) * newsubtotal;
    total = newsubtotal + newsales;
    System.out.println("Discount = $" + newdiscount);
    System.out.println("Subtotal = $" + newsubtotal);
    System.out.println("Sales Tax = $" + newsales);
    System.out.println("Total = $" + total);
}    
}
