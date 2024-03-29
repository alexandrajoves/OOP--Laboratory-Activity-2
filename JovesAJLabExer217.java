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
public class JovesAJLabExer217 {
     public static void main(String[] args) throws IOException{
        int[][] image  = {
            {0,0,0,0,0,0,0,0,0,0,0,0}, 
            {0,0,0,0,0,0,0,0,0,0,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,5,5,5,5,5,5,5,5,0,0}, 
            {0,0,0,0,0,0,0,0,0,0,0,0}, 
            {0,0,0,0,0,0,0,0,0,0,0,0}
        };
        
        int[][] smooth = new int[image.length][image[0].length];
        int sum;
       
        for(int row = 1; row < image.length - 1; row++){
            for(int col = 1; col < image[row].length - 1; col++){
                sum = (image[row - 1][col - 1] + image[row - 1][col] + image[row - 1][col + 1] + image[row][col - 1] + image[row][col] + image[row][col + 1] + image[row + 1][col - 1] + image[row + 1][col] + image[row + 1][col + 1]);
                smooth[row][col] = sum / 9;
            }  
        }   
        
        System.out.println("Input: ");
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){
                System.out.print(image[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Output: ");
        for(int row = 0; row < smooth.length; row++){
            for(int col = 0; col < smooth[row].length; col++){
                System.out.print(smooth[row][col] + " ");
            }
            System.out.println();
        }
        
    }
    
}
