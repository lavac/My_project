/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lavanya C
 */
import java.util.*;
public class Prime_factor {
    public static void main(String args[]) {
        boolean no_prime_factor = true;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // for loop till n/2, because above n/2 it cannot devide n.
        for(int i = 2; i <= n/2; i++) {
        //check is n is divisible by i and also check if it is prime or not
            if(n%i == 0 && prime_factor(i)) {
                System.out.println(i);
                no_prime_factor = false;
            }
        }
        // if the given number doesn't have any prime factors, display that.
        if(no_prime_factor) {
            System.out.println("This number doesn't have any prime factors.");
        }
    
    }
        
    
    // function to test for prime 
    static boolean prime_factor(int i){
        boolean flag = true;
        int j;
        for(j = 2; j <=i/2; j++ ) {
           if(i%j == 0) {
           flag = false;
           }
        }
        return flag; 
    }
   
}
