
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Applprog_19 {
    
// File:        Applprog_19.java
// Project:     Assignments
// Assignment:  #19
// Programmer:  Nelsa Hopper
// Date:        12/12/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Sorted Arrays
    
  
public static void main(String[] args) throws FileNotFoundException{
    
    System.out.println("    Assignment #19");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
    int size, num = 0, line = 0, divide = 7;
    
   File file = new File ("Assign19.dat");
   Scanner dis = new Scanner(file);
   
   size = dis.nextInt();
   
    int[] array = new int[size];
    
   for(num = 0; num < size; num++){
           array[num] = dis.nextInt();
   }
   
   num = 0;
   System.out.printf("UNSORTED INTEGERS%n=================%n");
   while(num < size){
       line = num / divide;
       if(line == 1 || line == 2 || line == 3 || line == 4){
           System.out.printf("%n%8d", array[num]);
           divide += 7;
       }else{
           System.out.printf("%8d", array[num]);
       }
       num+=1;
   }
   
   
   System.out.printf("%n%n%nSORTED INTEGERS%n=================%n");
   
   Arrays.sort(array);
        num = 0;
        divide = 7;
       while(num < size){
           line = num / divide;
           if(line == 1 || line == 2 || line == 3 || line == 4){
           System.out.printf("%n%8d", array[num]);
           divide += 7;
       }else{
           System.out.printf("%8d", array[num]);
       }
       num+=1;
   }
          
          
         ///STRING ARRAYS
     
     ArrayList<String> data = new ArrayList<String>();     
          
     while(dis.hasNext()){
         data.add(dis.next());
     }
          
   System.out.printf("%n%n%nUNSORTED STRINGS%n=================%n");
     
   for(String count : data){
       System.out.printf("%s%n", count);
   }
          
          
   System.out.printf("%n%nSORTED STRINGS%n=================%n");
   data.sort(null);
   for(String count : data){
       System.out.printf("%s%n", count);
   }   
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
}
}
