
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_14 {
    
// File:        Applprog_14.java
// Project:     Assignments
// Assignment:  #14
// Programmer:  Nelsa Hopper
// Date:        11/1/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: 

    public static float TaxR(float income, Float exemptions){
        float taxrate;
        
         if (income > 50000.00f){
        if (exemptions <= 3){
            taxrate = 25.5f;
        }
        else{
            taxrate = 17.75f;
        }
    }
    else{
        if (exemptions <= 3){
            taxrate = 12.75f;
        }
        else{
            taxrate = 7.5f;
        }
    }
         return taxrate;
         
    }
    
public static void main(String[] args){
    
    System.out.println("    Assignment #14");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
    float income, exemptions;
    double tax;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Income(if you wish to exit enter 0) : ");
    income = scan.nextFloat();
    while(income != 0){
    System.out.println("Enter Exemptions : ");
    exemptions = scan.nextFloat();
    System.out.printf("Income =    $%7.2f", income);
    System.out.println("");
    System.out.printf("# Exemptions =  %5.0f", exemptions);
   
    
    System.out.println("");
    System.out.printf("Tax rate = %7.2f%%", TaxR(income, exemptions));
    System.out.println("");
    tax = income * ( TaxR(income, exemptions) / 100 );
    System.out.printf("Tax =     $%7.2f ", tax);
    System.out.println("");
    
    
    System.out.println("Enter Income(if you wish to exit enter 0) : ");
    income = scan.nextFloat();
    }
}
}  

