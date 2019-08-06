/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JovesAJLabActivity102;

import java.io.IOException;

/**
 *
 * @author Alexandra
 */
public class JovesAJLabExer213 {
   public static void main(String[] args) throws IOException{  
    int[][] data = {
            {3, 2, 5, 0 ,0 ,0}, 
            {1, 4, 4, 8, 13, 0}, 
            {9, 1, 0, 2, 0,0}, 
            {0, 2, 6, 3, -1, -8}};
        int sum;
        
        for(int col = 0; col < data[3].length; col++){
            sum = 0; 
        for(int row = 0; row < data.length; row++){
               sum += data[row][col];
            }
            
        System.out.println("Sum of data column[" + col + "]: " + sum);

            }
        }
}    
