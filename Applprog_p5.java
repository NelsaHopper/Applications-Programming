

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Applprog_p5 {
    
// File:        Applprog_p5.java
// Project:     Assignments
// Assignment:  Program #5
// Programmer:  Nelsa Hopper
// Date:        11/7/2022
// University:  McMurry University
// Course:      COIS-2350 Fall 2022
// Instructor:  Mr. Brozovic
// Compiler:    Apache NetBeans IDE
// Description: Roman Numerals

public static void main(String[] args) throws FileNotFoundException{
    int invaild = 0, vaild = 0;
    System.out.println("    eMcM Flim Production");
    System.out.println("        Roman Numerals");
    System.out.println("       by Nelsa Hopper");
   
int length, value, XC,CM,CD,XL,IX,IV;
char num, before;
String roman;
boolean end, d, c, l, x, v, i;
File file = new File ("P5Data.dat");
Scanner infile = new Scanner(file);
PrintWriter myout = new PrintWriter("P5Output.txt");


while (infile.hasNext()){
    roman = infile.next();
    roman = roman.toUpperCase();
    length = roman.length();
    before = roman.charAt(0);
    
    end = false;
    value = 0;
    XC = 0;
    CM = 0;
    CD = 0;
    XL = 0;
    IX = 0;
    IV = 0;
    d = false;
    c = false;
    l = false;
    x = false;
    v = false;
    i = false;
            
    
    for (int character = 0; character < length;
        character += 1) {
        
    num = roman.charAt(character);
    
    switch (num){
        case 'M':
            if (before == 'C'){
                value += 800;
                CM = 1;
            }else{
            value += 1000;
            if(d == true|| c == true|| l == true|| x == true || v == true || i == true){
                end = true;}
            }
            break;
            
            
        case 'D':
            if(d == false){
            if(CM == 0){
            if (before == 'C'){
                value += 300;
                CD = 1;
            }else {
            value += 500;
            if( c == true || l == true|| x == true || v == true || i == true){
                end = true;}
            d = true;
            }}else{
                end = true;
            }
            }else{
                end = true;
            }
            break;
            
            
        case 'C':
            if(CD == 0){
            if(CM == 0){
            if (before == 'X'){
                value += 80;
                XC = 1;
            }else{
            value += 100;
            if( l == true|| x == true || v == true || i == true){
                end = true;}
            c = true;
            }}else{
                end = true;
            }}else{
                end = true;
            }
            break;
            
            
        case 'L':
            if( l == false){
            if(XC == 0){
            if (before == 'X'){
                value += 30;
                XL = 1;
            }else{
            value += 50;
            if(x == true || v == true || i == true){
                end = true;}
            l = true;
            }}else{
                end = true;
            }}else{
                end = true;
            }
            break;
            
            
        case 'X':
            if(XL == 0){
            if(XC == 0){
            if (before == 'I'){
                value += 8;
                IX = 1;
            }else{
            value += 10;
            if( v == true || i == true){
                end = true;}
            x = true;
            }}else{
                end = true;
            }}else{
                end = true;
            }
            break;
            
            
        case 'V':
            if(v == false){
            if(IX == 0){
            if (before == 'I'){
                value += 3;
                IV = 1;
            }else{
            value += 5;
            if(i == true){
                end = true;}
            v = true;
            }}else{
                end = true;
            }}
            break;
            
            
        case 'I':
            if (IV == 0){
            value += 1;
            i = true;
            }else{
                end = true;
            }
            break;
            
            
        default:
            end = true;
            
       }//End Of switch
    
    
    before = roman.charAt(character);
    
}//End Of For
    
    
    if(end == false){
    myout.printf("%n%s %d", roman, value);
    vaild += 1;
    }else{   
    System.out.printf("%n%s INVAILD", roman);
    invaild += 1;
    }

    
}//End Of While


    System.out.printf("%n%n%d CONVERSIONS SUCCESSFUL", vaild);
    System.out.printf("%n%d CONVERSIONS INVAILD", invaild);
  
infile.close();
myout.close();

}}
