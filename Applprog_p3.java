
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_p3 {
    
// File:        Applprog_p3.java
// Project:     Assignments
// Assignment:  Program #3
// Programmer:  Nelsa Hopper
// Date:        10/11/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Monthly Sales, Base Salary, Commission, % of Base

public static void main(String[] args){
    
    System.out.println("    eMcM Financial Services");
    System.out.println("   Sales Commission Program");
    System.out.println("       by Nelsa Hopper");
    System.out.println("");
    System.out.println("");
    
Scanner scan = new Scanner(System.in); 
float sales, basesal = 9000.00f, commission = 0.0f, total;
float base = 0;

System.out.print("     Input Sales:  $ ");
sales = scan.nextFloat();

System.out.println("");

System.out.print("    Monthly Sales: $" + sales);
if (sales > 1000000 || sales < 0){
    System.out.println("Sales Amount was Invalid");
}else{
    
      
    if (sales > 550000){
        commission = commission + (.1165f * (sales - 650000) + (.0535f * 325000));
        
    } 
    else if(sales > 250000){   
           commission = commission + (.0535f * (sales - 325000));
    } 
     
        
    base = (commission / basesal) * 100;
    total = commission + basesal;
    
System.out.printf("%n    Base Salary:   $ %8.2f", basesal);
System.out.printf("%n    Commission:    $ %8.2f", commission);
System.out.printf("%n    Total Salary:  $ %8.2f", total);
System.out.printf("%n    %% of Base:      %8.2f%%%n", base);
}
}    
}
