
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_12 {
    
// File:        Applprog_11.java
// Project:     Assignments
// Assignment:  #12
// Programmer:  Nelsa Hopper
// Date:        10/13/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: FOR loops

public static void main(String[] args){
    
    System.out.println("    Assignment #12");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
    
    int start, end, swap, count;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a starting Integers: ");
    start = scan.nextInt();
    System.out.print("Enter a Ending Integers: ");
    end = scan.nextInt();
    System.out.println("");
   /* 
    if( end < start){
        swap = end;
        end = start;
        start = swap;
    }
   */
   int endd = start;
    for(count = start; count <= end; count += 1){
        System.out.println(count);
    }
        System.out.println("Exit Value: " + count);
    
    System.out.println("");
    System.out.println("");
    for(count = end; count >= start; count -= 1){
        System.out.println(count);
    }
        System.out.println("Exit Value: " + count);
}
}    

