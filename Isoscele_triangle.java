/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lavanya C
 * 
 * 
 */


import java.util.*;
public class Isoscele_triangle {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // get n value from user
        int n = in.nextInt();
        int j = 1;
        // for loop for n times
        for(int i = 1; i <= n; i++) {
        //for loop to print spaces
            for(int k = n-i ; k > 0; k--) {
                System.out.print(" ");
            }
        // for loop to print stars
            for(int l = j; l > 0 ; l--) {
                System.out.print("*");
            }
            j = j+2;
        //to print a newline
            System.out.println();
        }
        
    }
    
}
