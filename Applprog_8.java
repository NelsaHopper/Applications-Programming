
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_8 {
    
// File:        Applprog_8.java
// Project:     Assignments
// Assignment:  #8
// Programmer:  Nelsa Hopper
// Date:        9/29/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Roman Numerals

public static void main(String[] args){
    
    System.out.println("    Assignment #8");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
Scanner scan = new Scanner(System.in);
    String roman;
    char numeral;
    System.out.print("Enter a Single Roman Numeral Character : ");
    roman = scan.next();
    roman = roman.toUpperCase();
    numeral = roman.charAt(0);
    int value;
    switch (numeral){
        case 'M':
            value = 1000;
            break;
        case 'D':
            value = 500;
            break;
        case 'C':
            value = 100;
            break;
        case 'L':
            value = 50;
            break;
        case 'X':
            value = 10;
            break;
        case 'V':
            value = 5;
            break;
        case 'I':
            value = 1;
            break;
        default:
            value = 0;
    }
    if ( value != 0){
     System.out.println("Roman Numeral Symbol " + numeral + 
             " has integer value " + value);
    }
    else{
        System.out.println("Illegal character " + numeral + 
                " entered [only M,D,C,L,X,V,T allowed]");
    }
}    
}
