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
public class JovesAJLabExer211 {
     public static void main(String[] args) throws IOException{
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8}};
        int sum = 0;
        
        for(int row = 0; row < data.length; row++){
            for(int x = 0; x < data[row].length; x++){
                sum += data[row][x];
            }
        }
        System.out.println("Sum is: " + sum);
    }
    
}
