
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_9 {
    
// File:        Applprog_9.java
// Project:     Assignments
// Assignment:  #9
// Programmer:  Nelsa Hopper
// Date:        9/4/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: String Compare

public static void main(String[] args){
    
    System.out.println("    Assignment #9");
    System.out.println("    by Nelsa Hopper");
    System.out.println("");
    
Scanner scan = new Scanner(System.in);

    String s1, s2, sort;
    int result1, result2;
    System.out.print("Enter 1st Line: ");
    s1 = scan.nextLine();
    System.out.print("Enter 2nd Line: ");
    s2 = scan.nextLine();
    result1 = s1.compareToIgnoreCase(s2);
    result2 = s2.compareToIgnoreCase(s1);
    System.out.println("");
    if(result1 > result2){
        sort = "sorts > or AFTER";
    }
    else if(result1 == result2){
        sort = "MATCHES";
    }
    else{
        sort = "sorts < or BEFORE";
    }
        System.out.printf("%s %s %s", s1, sort, s2);
  
}    
}
