
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Applprog_p4 {
    
// File:        Applprog_p4.java
// Project:     Assignments
// Assignment:  Program #4
// Programmer:  Nelsa Hopper
// Date:        10/20/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: 
    
public static void main(String[] args) throws FileNotFoundException{
   double investtotal = 0, monthlytotal = 0, totaltotal = 0, profittotal =0;
   double invested = 999999.99, total = 9999999.99, profit = 9999999.99, monthly = 9999.99,
           apr = 99.999, rate;
   int years = 99, months, data = 0;

    
    System.out.println("%n%n                                         Program 4");
    System.out.println("                                      By Nelsa Hopper");
    System.out.println("                                    COIS-2350 Fall 2022%n%n");

System.out.println("     Amount                          Monthly       Total");
System.out.println("    Invested      APR      Years     Payment      Payments        Profit");
System.out.printf("   $%8.2f  %6.3f%%     %d      $%8.2f    $%8.2f   $%8.2f", invested, apr,
        years, monthly, total, profit);
   

   File file = new File ("Program04.dat");
   Scanner dis = new Scanner(file);
   
while (dis.hasNext()) {
    data += 1;
   invested = dis.nextDouble();
   apr = dis.nextDouble();
   years = dis.nextInt();
   
   rate = (apr / 1200);
   months = years * 12;
   monthly = (invested * (rate)) / (1 - Math.pow((1 + (rate)), (-months)));
   total = (monthly * months);
   profit = total - invested;
   
   investtotal += invested;
   monthlytotal += monthly;
   totaltotal += total;
   profittotal += profit;
   
   
  System.out.printf("%n   $%8.2f  %6.3f%%     %d      $%8.2f    $%8.2f   $%8.2f", invested, apr,
          years, monthly, total, profit);

}
   dis.close();
   System.out.printf("%n%n   $%8.2f                     $%8.2f  $%8.2f $%8.2f%n", investtotal, monthlytotal, totaltotal, profittotal);
   System.out.printf("%n         %d sets of data successfully processed%n", data);
}
}



