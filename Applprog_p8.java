//P8AcctNbrs.dat
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Applprog_p8 {
    
// File:        Applprog_p8.java
// Project:     Assignments
// Assignment:  #8
// Programmer:  Nelsa Hopper
// Date:        12/13/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: FINAL//Account Numbers
    public static float calcCheckSum(String input){
        int Checkcode, osum = 0, esum = 0, length, count = 0, total, right;
        char value;
        
    
        length = input.length();
        for(int odd = 1; odd < length; odd+=2){
            if(odd != length){
                value = input.charAt(odd);
                osum += Character.getNumericValue(value);
                if(odd > 4){
                    count+=1;
                }
            
            }
        }
        
        osum = osum * 3;
        
        for(int even = 0; even < length; even+=2){
            if( even != length){
                value = input.charAt(even);
                esum += Character.getNumericValue(value);
            }
        }
        
        total = osum + esum + count;
        right = total % 10;
        Checkcode = 10 - (right);
         return Checkcode;
         
    }
    
public static void main(String[] args) throws FileNotFoundException{
    
    System.out.printf("%n%n   Program #8%n");
    System.out.println("   by Nelsa Hopper");
    System.out.printf("   COIS-2350 Fall 2022%n%n%n");
    
   
    Scanner scan = new Scanner(System.in);
    
    boolean files = true;
    String read;
   
    System.out.print("Enter name of input file: ");
    read = scan.nextLine();

    
   // File file = new File ("P8AcctNbrs.dat");

    File file = new File (read);

  if(file == null){
      files = false;
       System.out.println("Cannot Read from input file: " + read);
   }  
       
       
   int size;
   float code;
   
       
       Scanner dis = new Scanner(file); 
       
       size = dis.nextInt();
       String[] accountn = new String[size];
      
       while(dis.hasNext()){
           for(int c = 0; c < size; c++){
               accountn[c] = dis.next();
           }
       }
   
       dis.close();
       System.out.printf("%n    Account Numbers%n");
       
       for(int c = 0; c < size; c++){
           System.out.printf("  %s%n", accountn[c]);
           
       }
       System.out.printf("%n");
       
       System.out.printf("%n    Account Numbers               CheckCode          %n");
       
       for(int c = 0; c < size; c++){
           code = calcCheckSum(accountn[c]);
           System.out.printf("  %7s               %5.0f", accountn[c], code);
       
           if(code == (accountn[c] % 10) ){
           
               System.out.printf("      VAILD");
               }
           else{
               System.out.printf("      INVAILD");
           }
       System.out.printf("%n");

       
   
   
       
       

       
       }
}
}




