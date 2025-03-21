
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class Applprog_11 {
    
// File:        Applprog_11.java
// Project:     Assignments
// Assignment:  #11
// Programmer:  Nelsa Hopper
// Date:        10/11/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Do-While Input Validation

public static void main(String[] args){
    
    System.out.println("    Assignment #11");
    System.out.println("    by Nelsa Hopper");
    System.out.println("    McMurry University");
    System.out.println("    COIS-2350 Fall 2022");
    System.out.println("");
    
    boolean errflag;
    Scanner scan = new Scanner(System.in);
    
    int month;
   do{
       errflag = false;
    System.out.println("Enter a month by the number(EX: 1-12): ");
    month = scan.nextInt();
    if(month < 0 || month > 12){
        System.out.println("Invaild input - please try again!");
        errflag = true;
    }
}while (errflag);
   
    
    
    float gpa;
   do{
       errflag = false;
    System.out.println("Enter a GPA vaule (EX: 0.0-4.0): ");
    gpa = scan.nextFloat();
    if(gpa < 0.0f || gpa > 4.0f){
        System.out.println("Invaild input - please try again!");
        errflag = true;
    }
}while (errflag);
   scan.nextLine();
 
    String YN;
    char yn;
    do {
        errflag = false;
    System.out.println("Enter Y / N : ");    
    YN = scan.nextLine();
    YN = YN.toUpperCase();
    yn = YN.charAt(0);
    if(yn == 'Y' || yn == 'N'){
   }
   else{
        System.out.println("Invaild input - please try again!");
        errflag = true;
    }
    }while (errflag);

    int ID, id;
    do {
        errflag = false;
    System.out.println("Enter a Student ID (only 9 Characters): ");
    ID = scan.nextInt();
    id = ID / 1000000000;
    if (id > 0){
        System.out.println("Invaild input - please try again!");
        errflag = true; 
    }
    }while(errflag);
    
   System.out.println("");
   System.out.println("Month = " + month);
   System.out.println("GPA = " + gpa);
   System.out.println("Y/N = " + yn);
   System.out.println("Student ID = " + ID );
   
}
}    

