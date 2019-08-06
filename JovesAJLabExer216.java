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
public class JovesAJLabExer216 {
    public static void main(String[] args) throws IOException{
     
        int[][] data = {
            {3, 2, 5}, 
            {1, 4, 4, 8, 13}, 
            {9, 1, 0, 2}, 
            {0, 2, 6, 3, -1, -8}
        };
        int x;
        
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length /2; col++){
                x = data[row][col];
                data[row][col] = data[row][data[row].length - 1 - col];
                data[row][data[row].length - 1 - col] = x;
            }     
        }
        System.out.println("Reversed Data:");
        for(int row = 0; row < data.length; row++){
            System.out.print("{");
            for(int col = 0; col < data[row].length; col++){
                System.out.print(data[row][col] + ", ");
            }
            System.out.println("}");
        }
    } 
}
