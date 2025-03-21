
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Applprog_p6 {
    
// File:        Applprog_p6.java
// Project:     Assignments
// Assignment:  Program #6
// Programmer:  Nelsa Hopper
// Date:        11/29/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: 
     public static double MPayment(double income, double r, int month){
         double monthly;
         monthly = (income * (r)) / (1 - Math.pow((1 + (r)), (-month)));
         
         return monthly;
         
     }
    
public static void main(String[] args) throws FileNotFoundException{
   double investtotal = 0, monthlytotal = 0, totaltotal = 0, profittotal =0;
   double invested, total, profit, monthly, apr, rate;
   int years, months, data = 0, BadData = 0;
   boolean run = true, files = true;
   String read, write;

    
    System.out.println("                                         Program #6");
    System.out.println("                                      By Nelsa Hopper");
    System.out.println("                                    COIS-2350 Fall 2022");

   
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter name of input file: ");
    read = scan.next();
    System.out.print("Enter name of output file: ");
    write = scan.next();


   if( read == null){
       files = false;
       System.out.println("Cannot Read from input file: P6Data.dat");
   }
   if( write == null){
       files = false;
       System.out.println("Cannot Write from input file: P6Report.txt");
   }
   
   
   File file = new File (read);
   Scanner dis = new Scanner(file);
   PrintWriter myout = new PrintWriter(write);
   
   if( files ==  true){
   
while (dis.hasNext()) {
    data += 1;
   invested = dis.nextDouble();
   apr = dis.nextDouble();
   years = dis.nextInt();
   
   
   if(10000 <= invested && invested <= 250000){
   }else{
       run = false;
       BadData += 1;
   }
   if(5.000 <= apr && apr <= 15.000){
   }else{
       run = false;
       BadData += 1;
   }
   if(10 <= years && years <= 50){
   }else{
       run = false;
       BadData += 1;
   }
   
   if(run == false){
       myout.printf("Bad data: %n   $%8.2f  %6.3f%%     %d", invested, apr,
          years);
   }
   
   if (run == true){
   rate = (apr / 1200);
   months = years * 12;
   monthly = MPayment(invested, rate, months);
   total = (monthly * months);
   profit = total - invested;
   
   investtotal += invested;
   monthlytotal += monthly;
   totaltotal += total;
   profittotal += profit;
   
   
  myout.printf("%n   $%8.2f  %6.3f%%     %d      $%8.2f    $%8.2f   $%8.2f", invested, apr,
          years, monthly, total, profit);
   }
}
   dis.close();
   myout.printf("%n%n   $%8.2f                     $%8.2f  $%8.2f $%8.2f%n", investtotal, monthlytotal, totaltotal, profittotal);
   System.out.printf("%n         %d sets of data successfully processed%n", data);
   System.out.printf("         %d sets of data contained data outside expected ranges%n", BadData);
   
   }
}
}



