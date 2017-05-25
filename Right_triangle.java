/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments_thoghtworks;
import java.util.*;

/**
 *
 * @author Lavanya C
 */
public class Right_triangle {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    // for loops to print stars in triangle shape.
    for(int i = 0; i< n; i++) {
        for(int j = 0; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    
}
    
}
}
