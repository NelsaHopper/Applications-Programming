
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Applprog_18 {
    
// File:        Applprog_18.java
// Project:     Assignments
// Assignment:  #18
// Programmer:  Nelsa Hopper
// Date:        11/29/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Arrays
    
public static void main(String[] args) throws FileNotFoundException{
    
    System.out.println("    Assignment #18");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
   Double av1 = 0.0, sum1 = 0.0, av2 = 0.0, sum2 = 0.0, scan = 0.0;
   int num = 0;
   
   ArrayList<Double> array1 = new ArrayList<Double>();
   ArrayList<Double> array2 = new ArrayList<Double>();
   
   File file = new File ("Assign16a.dat");
   Scanner dis = new Scanner(file);
    
   System.out.printf("  First Array: %n");
   while (dis.hasNext()){
           array1.add(dis.nextDouble());
   }
   
   for(Double count : array1 ){
           System.out.printf("    %8.3f%n", count);
           sum1+=count;
       }
   av1 = sum1 / array1.size();
   System.out.printf("%nSum: %8.3f%nAvg: %8.3f", sum1, av1);
   
   System.out.printf("%n%n  Second Array: %n");
   int size = array1.size();
   Double addin;
   
   for(Double count : array1){
       addin = (count * count) / av1;
       array2.add(0, addin);
   }
   
   
   for(Double count : array2){
       System.out.printf("    %8.3f%n", count);
       sum2+=count;
   }
   av2 = sum2 / array2.size();
   System.out.printf("%nSum: %8.3f%n Avg: %8.3f", sum2, av2);
   System.out.printf("%n");
}
}  

