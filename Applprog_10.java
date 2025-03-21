
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_10 {
    
// File:        Applprog_10.java
// Project:     Assignments
// Assignment:  #10
// Programmer:  Nelsa Hopper
// Date:        10/6/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: While and Do-While

public static void main(String[] args){
    
    System.out.println("    Assignment #10");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
    int loop1 = 50, loop2 = 27, loop3 = 1;
    float loop4 = 912873.465000f;
    
   while (loop1 > 21){
    System.out.println(loop1);
    loop1 = loop1 - 3;
}
   System.out.println("Exit value = " + loop1);
   System.out.println("");
   
   while (loop2 < 75){
    System.out.println(loop2);
    loop2 = loop2 + 5;
}
   System.out.println("Exit value = " + loop2);
   System.out.println("");
   
   while (loop3 < 2500){
    System.out.println(loop3);
    loop3 = loop3 * 2;
}
   System.out.println("Exit value = " + loop3);
   System.out.println("");
   
   while (loop4 > .001){
    System.out.printf("%8.6f %n", loop4);
    loop4 = loop4 / 10;   
}
   System.out.printf("Exit value = %8.6f %n", loop4);
   System.out.println("");
   
   
   System.out.println(" Let's do it again with DO-WHILE loops! %n");
   
   loop1 = 50;
   loop2 = 27;
   loop3 = 1;
   loop4 = 912873.465000f;
    
   
   do{
    System.out.println(loop1);
    loop1 = loop1 - 3;
}while (loop1 > 21);
   System.out.println("Exit value = " + loop1);
   System.out.println("");
   
   do{
    System.out.println(loop2);
    loop2 = loop2 + 5;
}while (loop2 < 75);
   System.out.println("Exit value = " + loop2);
   System.out.println("");
   
   do{
    System.out.println(loop3);
    loop3 = loop3 * 2;
}while (loop3 < 2500);
   System.out.println("Exit value = " + loop3);
   System.out.println("");
   
   do{
    System.out.printf("%8.6f %n", loop4);
    loop4 = loop4 / 10;   
}while (loop4 > .001);
   System.out.printf("Exit value = %8.6f %n", loop4);
   System.out.println("");
   
}
}    

