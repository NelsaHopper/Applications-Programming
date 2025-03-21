
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_p1 {
    
// File:        Applprog_p1.java
// Project:     Assignments
// Assignment:  Program #1
// Programmer:  Nelsa Hopper
// Date:        9/22/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Counting Money

public static void main(String[] args){
    
    System.out.println("    eMcM Financial Services");
    System.out.println("       by Nelsa Hopper");
    System.out.println("        Money Program");
    System.out.println("");
    System.out.println("Enter counts of following denominations: ");
    
Scanner scan = new Scanner(System.in);
   int Twenty, Ten, Five, One, quarter, dime, nickel, pennies, Twentyv, Tenv, Fivev, Onev;
   float quarterv, dimev, nickelv, penniesv;
   double TOTAL = 0;
    System.out.print("$20 bills : ");
    Twenty = scan.nextInt();
    System.out.print("$10 bills : ");
    Ten = scan.nextInt();
    System.out.print("$5 bills : ");
    Five = scan.nextInt();
    System.out.print("$1 bills : ");
    One = scan.nextInt();
    System.out.print("Quarters : ");
    quarter = scan.nextInt();
    System.out.print("Dimes : ");
    dime = scan.nextInt();
    System.out.print("Nickels : ");
    nickel = scan.nextInt();
    System.out.print("Pennies : ");
    pennies = scan.nextInt();
    
    Twentyv = (Twenty * 20);
    Tenv = (Ten * 10);
    Fivev = (Five *5);
    Onev = (One *1);
    quarterv = (float) (quarter * .25);
    dimev = (float) (dime * .10);
    nickelv = (float) (nickel * .05);
    penniesv = (float) (pennies * .01);
    
    
    System.out.printf("%n%3d bills $20         $%7d", Twenty, Twentyv );
    TOTAL = TOTAL + Twentyv;
    System.out.printf("%n%3d bills $10         $%7d", Ten, Tenv);
    TOTAL = TOTAL + Tenv;
    System.out.printf("%n%3d bills $5          $%7d", Five,  Fivev);
    TOTAL = TOTAL + Fivev;
    System.out.printf("%n%3d bills $1          $%7d", One, Onev);
    TOTAL = TOTAL + Onev;
    System.out.printf("%n%3d coins of 25 cents $%7.2f", quarter, quarterv);
    TOTAL = TOTAL + quarterv;
    System.out.printf("%n%3d coins of 10 cents $%7.2f", dime, dimev);
    TOTAL = TOTAL + dimev;
    System.out.printf("%n%3d coins of 5 cents  $%7.2f", nickel, nickelv);
    TOTAL = TOTAL + nickelv; 
    System.out.printf("%n%3d coins of 1 cents  $%7.2f", pennies, penniesv);
    TOTAL = TOTAL + penniesv;
    System.out.printf("%nTotal value =        $%7.2f%n", TOTAL);
}    
}
