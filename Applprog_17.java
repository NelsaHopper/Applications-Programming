
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_17 {
    
// File:        Applprog_17.java
// Project:     Assignments
// Assignment:  #17
// Programmer:  Nelsa Hopper
// Date:        12/1/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: "Table" Arrays
    
public static void main(String[] args) throws FileNotFoundException{
    
    System.out.println("    Assignment #17");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
   final int COLS = 4;
   final int ROWS = 9;
   
   int row,col;
   double sum = 0, sum2 = 0;
   double[][] arrayRC = new double[ROWS][COLS];
   
   int[] arrayrow = new int[ROWS];
   int[] arraycol = new int[COLS];
   for(row = 0; row < ROWS; row++){
       arrayrow[row] = 0;
       for(col = 0; col < COLS; col++){
           arrayrow[row] += arrayRC[row][col];
       }
   }
       for(col = 0; col < COLS; col++){
           System.out.printf("      %7d", col);   
       }
       
       for(row = 0; row < ROWS; row++){
           System.out.printf("%n    %d", row);
           for(col = 0; col < COLS; col++){
               arrayRC[row][col] = (double) ((row + col) * (Math.sqrt((row*row*row) + (col*col*col))));
               System.out.printf("%10.3f   ", arrayRC[row][col]);
               sum += arrayRC[row][col];
           }
           }
       
       System.out.printf("%n%nSum = %10.3f%n", sum);

       
       ///NEW ARRAY NEW ARRAY NEW ARRAY
       
  
   
       double[][] array2RC = new double[COLS][ROWS];
        for(col = 0; col < COLS; col++){
       arrayrow[col] = 0;
       for(row = 0; row < ROWS; row++){
           arrayrow[col] += array2RC[col][row];
       }
   }
       for(row = 0; row < ROWS; row++){
           System.out.printf("      %7d", row);   
       }
       
       for(col = 0; col < COLS; col++){
           System.out.printf("%n    %d", col);
           for(row = 0; row < ROWS; row++){
               array2RC[col][row] = (double) (arrayRC[row][col] / (row + col + 1));
               System.out.printf("%10.3f   ", array2RC[col][row]);
               sum2 += array2RC[col][row];
           }
           }
       
       System.out.printf("%n%nSum = %10.3f%n%n", sum2);

}
}

