
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_p2 {
    
// File:        Applprog_p1.java
// Project:     Assignments
// Assignment:  Program #2
// Programmer:  Nelsa Hopper
// Date:        9/29/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Credit Card Statement

public static void main(String[] args) throws FileNotFoundException{
    
    System.out.println("    eMcM Financial Services");
    System.out.println("       by Nelsa Hopper");
    System.out.println("        Credit Card Report");
    System.out.println("");
    System.out.println("Enter counts of following denominations: ");
    

float APR, previousbalance, minpayment, charges, payments
        ,financecharge, newbalance, minipayment;
   File myFile = new File ("Prog2Data.txt");
   Scanner inFile = new Scanner(myFile);
   previousbalance = inFile.nextFloat();
   minpayment= inFile.nextFloat();
   APR = inFile.nextFloat();
   charges = inFile.nextFloat();
   payments = inFile.nextFloat();
  
    System.out.printf("Previous Balance: $%5.2f %n", previousbalance);
    System.out.printf("Min Payment %%:    %5.2f%% %n", minpayment);
    System.out.printf("APR :              %5.2f%% %n", APR);
    financecharge = (APR / 1200) * previousbalance;
    System.out.printf("Finance Charge:   $%5.2f %n", financecharge);
    System.out.printf("Chagres:          $%5.2f %n", charges);
    System.out.printf("Payments:         $%5.2f %n", payments);
    newbalance = (previousbalance + financecharge + charges) - payments;
    System.out.printf("New Balance:      $%5.2f %n", newbalance);
    minipayment = (minpayment * .01f) * newbalance;
    System.out.printf("Minimum Payment   $%5.2f %n", minipayment);
   
    inFile.close();
   }    
}
