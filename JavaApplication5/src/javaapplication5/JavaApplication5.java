/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
package cubes.squares.powers;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        
        int choice = 0;
        double base = 0;
        double ans;
        double power;
        
        while ( choice != 4)
        {
            System.out.println("1 → Find the value of a number squared (Ex: 2*2 = 2 x 2)");
            System.out.println("2 → Find the value of a number cubed (Ex: 2*3 = 2 x 2 x 2)");
            System.out.println("3 → Find the value of a number, to any power");
            System.out.println("4 → Exit");
            System.out.println("Prease enter your choice.");
        
            choice = scan.nextInt();
            
            if ( choice == 1 ) 
                {
                    System.out.println(" What is your BASE?? ");
                    base = scan.nextInt();
                    System.out.println(" Your base = "+ base +"");
                    ans = base * base;
                    System.out.println("Answer: "+ ans +"");
                }
            
            
            if ( choice == 2 )
                {
                    System.out.println(" What is the base? ");
                    base = scan.nextInt();
                    System.out.println("Your base = "+ base +"");
                    ans = base * base * base;
                   
                    System.out.println("          Answer: "+ ans +"");
                    
                }
            
            
            if ( choice == 3 )
                {
                    System.out.println(" What is the base? ");
                    base = scan.nextInt();
                    System.out.println("Your base = "+ base +"");
                    System.out.println("Prease enter the powers");
                    power = scan.nextInt();
                    System.out.println("Your power = "+ power +"");
                    double num1 = 0;
                    double num2 = 1; 
                    while (num1 < power) 
                        {
                            num2 = num2 * base;
                            num1 = num1 + 1;
                        }
                    
                    System.out.println("Answer: "+ num2 +"");    
                    
                }
        }    
        
            if ( choice == 4 )
                {
                    System.out.println("bye");
                }
        
        
        
    }
    
}
