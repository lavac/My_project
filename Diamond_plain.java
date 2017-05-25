/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lavanya C
 */
// this programs prints asterisk to make diamond.
import java.util.*;

class Display_diamond {
    private int n;
    Scanner in = new Scanner(System.in);
    
    //constructor to set default value for n.
    Display_diamond () {
       // set default value for n
       n = 0;
    }

    // function to get user value for n
    void get_number() {
        System.out.println("enter n value");
        n = in.nextInt();
    }
    
    //function to print the diamond.
    void print_diamond() {
        int j = 1;
        // this loop is to print the upper side of the diamond
        for(int i = 1; i <= n; i++) {
        // this loop is to print the space in each line.
            for(int k = n-i ; k > 0; k--) {
                System.out.print(" ");
            }
        // this loop is to print the stars.
            for(int l = j; l > 0 ; l--) {
                System.out.print("*");
            }
            j = j+2;
        // to print the newline
            System.out.println();
        }
        // j has number of spaces to print in the line, it has incremented by 2 in last loop, so decrement it before going down  
        j = j-4;
        int k;
        
        // this loop is to print the lower side of the diamond
        for(int i = 1; i < n;i++) {
        // this loop is to print the space in each line.
            for(k = 0; k < i; k++) {
                System.out.print(" ");
            }
        // this loop is to print the stars.
            for(int l=j; l > 0; l--) {
                System.out.print("*");
            }
            j = j-2;
        // to print the newline
            System.out.println();
        }
        
        
    }
    
    
}


public class Diamond_plain {
    public static void main(String args[]) {
        //create an oject of dimaond
        Display_diamond diamond_obj = new Display_diamond();
        //get a user value to print he diamond
        diamond_obj.get_number();
        //function to print the diamond
        diamond_obj.print_diamond();
    }
}
    

