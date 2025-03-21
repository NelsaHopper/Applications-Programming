
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_16 {
    
// File:        Applprog_16.java
// Project:     Assignments
// Assignment:  #16
// Programmer:  Nelsa Hopper
// Date:        11/29/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Arrays
    
public static void main(String[] args) throws FileNotFoundException{
    
    System.out.println("    Assignment #14");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
   Double av1 = 0.0, sum1 = 0.0, av2 = 0.0, sum2 = 0.0;
   int num = 0;
   Double[] array1 = new Double[25];
   Double[] array2 = new Double[25];
   File file = new File ("Assign16a.dat");
   Scanner dis = new Scanner(file);
    
   System.out.println("First Array: ");
   while (dis.hasNext()){
       if(num < 26){
           array1[num]= dis.nextDouble();
           num+=1;
       }
   }
   for(int count = 0; count < 25; count+=1){
           System.out.printf("%8.3f%n", array1[count]);
           sum1= sum1 + array1[count];
       }
   av1 = sum1 / 25;
   System.out.printf("%nSum: %8.3f%nAvg: %8.3f", sum1, av1);
   
   System.out.printf("%n%nSecond Array: %n");
   num =0;
   while(num < 25){
       array2[num] = (array1[num] * array1[num]) / av1;
           System.out.printf("%8.3f%n", array2[num]);
           sum2+=array2[num];
       num+=1;
   }
   av2 = sum2 / 25;
   System.out.printf("%nSum: %8.3f%n Avg: %8.3f", sum2, av2);
   System.out.printf("%n");
}
}  

