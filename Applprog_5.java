
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Applprog_5 {
    
// File:        Applprog_5.java
// Project:     Assignments
// Assignment:  #5
// Programmer:  Nelsa Hopper
// Date:        9/15/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: FILE INPUT EXERCISE

public static void main(String[] args) throws FileNotFoundException{
    
    System.out.println("    Assignment #5");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
    float subtotal, discount, sales, newsales, newdiscount, newsubtotal, total;
   /* System.out.print("Enter subtotal : ");
    subtotal = scan.nextFloat();
    System.out.print("Enter discount rate % : ");
    discount = scan.nextFloat();
    System.out.print("Enter sales tax rate % : ");
    sales = scan.nextFloat(); */
   
   File myFile = new File ("Assign05Data.txt");
   Scanner inFile = new Scanner(myFile);
   subtotal = inFile.nextFloat();
   discount = inFile.nextFloat();
   sales = inFile.nextFloat();
   
   PrintWriter myOut = new PrintWriter("Assign05Results.txt");
   
    System.out.println("");
    System.out.println("Subtotal = $" + subtotal);
    System.out.println("Discount Rate = " + discount);
    System.out.println("Sales Tax Rate = " + sales);
    System.out.println("");
    myOut.println("");
    myOut.println("Subtotal = $" + subtotal);
    myOut.println("Discount Rate = " + discount);
    myOut.println("Sales Tax Rate = " + sales);
    myOut.println("");
    newdiscount = (discount * .01f) * subtotal;
    newsubtotal = subtotal - newdiscount;
    newsales = (sales * .01f) * newsubtotal;
    total = newsubtotal + newsales;
    System.out.println("Discount = $" + newdiscount);
    System.out.println("Subtotal = $" + newsubtotal);
    System.out.println("Sales Tax = $" + newsales);
    System.out.println("Total = $" + total);
    myOut.println("Discount = $" + newdiscount);
    myOut.println("Subtotal = $" + newsubtotal);
    myOut.println("Sales Tax = $" + newsales);
    myOut.println("Total = $" + total);
    
    inFile.close();
    myOut.close();
    
}    
}
