/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lavanya C
 */
public class FizzBuzz {
   public static void main(String args[]) {
       //for loop 1 through 100 
        for( int i = 1; i < 100; i++) {
           // check numbers which is devisible by both 3 and 5.
           if(i%3 == 0 && i%5 == 0)
               System.out.println("FizzBuzz");
           // check numbers which is devisible by both 5.
           else if(i%5 == 0)
               System.out.println("Buzz");
           // check numbers which is devisible by both 3.
           else if(i%3 == 0)
               System.out.println("Fizz");
           // print the number if it is not devisible by 3 and 5.
           else
               System.out.println(i);
           
       }
       
   }
    
    
}
