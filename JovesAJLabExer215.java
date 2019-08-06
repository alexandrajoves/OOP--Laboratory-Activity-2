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
public class JovesAJLabExer215 {
     public static void main(String[] args) throws IOException{
        int[][] data = {
            {3, 2, 5}, 
            {1, 4, 4, 8, 13}, 
            {9, 1, 0, 2}, 
            {0, 2, 6, 3, -1, -8}
        };
        int largestNumber;
        
        for(int row = 0; row < data.length; row++){
            largestNumber = 0;
            for(int col = 0; col < data[row].length; col++){
                if(data[row][col] > largestNumber){
                    largestNumber = data[row][col];
                }
            }
            System.out.println("Largest number in data row[" + row + "]: " + largestNumber);
        }
}
}
