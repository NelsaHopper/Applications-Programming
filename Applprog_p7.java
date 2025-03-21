
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Applprog_p7 {
    
// File:        Applprog_p7.java
// Project:     Assignments
// Assignment:  #7
// Programmer:  Nelsa Hopper
// Date:        12/1/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: "Table" Arrays
    
public static void main(String[] args) throws FileNotFoundException{
    
    System.out.printf("%n%n    Program #7 - Arrays%n");
    System.out.printf("    by Nelsa Hopper%n%n");
    
    
   File file = new File ("P7Data.dat");
   Scanner dis = new Scanner(file);
    
   final int ROWS = dis.nextInt();
   final int COLS = dis.nextInt();
   
   int row,col,num = 0,line,divide = 7,i= 0;
   double sum = 0.0, MAX_VALUE = 0.0, MIN_VALUE = 0.0, avg = 0.0;
   double[] max = new double[COLS];
   double[] min = new double[ROWS];
   double[][] arrayRC = new double[ROWS][COLS];
   
   
   int[] arrayrow = new int[ROWS];
   int[] arraycol = new int[COLS];
   for(row = 0; row < ROWS; row++){
       arrayrow[row] = 0;
       min[row] = 0.0;
       for(col = 0; col < COLS; col++){
           arrayrow[row] += arrayRC[row][col];
           max[col] = -10.0;
       }
   }
   System.out.printf("Table");
   for(col = 0; col < COLS; col++){
       System.out.printf("       %3d ", col);   
   }
       
   
   for(row = 0; row < ROWS; row++){
       System.out.printf("%n    %2d", row);
       for(col = 0; col < COLS; col++){
           arrayRC[row][col] = dis.nextDouble();
           System.out.printf(" %10.3f", arrayRC[row][col]);
           if(arrayRC[row][col] > MAX_VALUE){
               MAX_VALUE = arrayRC[row][col];
           }
           if(arrayRC[row][col] < MIN_VALUE){
               MIN_VALUE = arrayRC[row][col];
           }
           sum += arrayRC[row][col];
           avg++;
       }
   }
       
   System.out.printf("%n%nCol");
   for(col = 0; col < COLS; col++){
       System.out.printf("       %3d ", col);
       for(row = 0; row < ROWS; row++){
       if(arrayRC[row][col] > max[col]){
           max[col] = arrayRC[row][col];
       }
       }
   }
   
   System.out.printf("%nMax:");
   for(col = 0; col < COLS; col++){
       System.out.printf(" %10.3f", max[col]);
   }
       
       
   for(row = 0; row < ROWS; row++){
       for(col = 0; col < COLS; col++){
           if(arrayRC[row][col] < min[row]){
           min[row] = arrayRC[row][col];
           }
       }
   }
   
   System.out.printf("%n%nRow");
   System.out.printf("%nMin:");
   for(row = 0; row < ROWS; row++){
       System.out.printf("%n    %2d", row);
       System.out.printf(" %10.3f", min[row]);
   }
       
   avg = sum / (COLS * ROWS);
       
   System.out.printf("%n%nOverall");
       System.out.printf("%nMax:   %10.3f", MAX_VALUE);
       System.out.printf("%nMin:   %10.3f", MIN_VALUE);
       System.out.printf("%nSum:   %10.3f", sum);
       System.out.printf("%nAvg:   %10.3f%n%n", avg);
       
       
       
       
       
       
       
}
}



