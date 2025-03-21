
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_13 {
    
// File:        Applprog_13.java
// Project:     Assignments
// Assignment:  #13
// Programmer:  Nelsa Hopper
// Date:        10/20/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: FOR NESTED loops

public static void main(String[] args){
    
    System.out.println("    Assignment #13");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
    
    int col, row, mrow, mcol;
    Scanner scan = new Scanner(System.in);
    System.out.print("How many Rows? : ");
    mrow = scan.nextInt();
    System.out.print("How many Columns? : ");
    mcol = scan.nextInt();
    System.out.println("");
    
    System.out.println("======================================================================");
    
    
            System.out.print("        ");
    for(col = 1; col < mcol + 1; col++){
        System.out.printf(" %6d ", col);
    }
    
            System.out.println(" ");
    for(row = 1; row < mrow + 1; row++)
    {
            System.out.printf(" %6d ", row);
        for(col = 1; col < mcol + 1; col++){
            System.out.printf(" %6d ", (row * 100 + col));
        }
            System.out.println(" ");
    }
}
}    

