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
public class JovesAJLabExer208 {
     public static void main(String[] args) throws IOException{
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int result;
        
        for(int j = 0; j < data.length / 2; j++){
            result = data[j];
            data[j] = data[data.length - 1 - j];
            data[data.length - 1 - j] = result;
        }          
        
        System.out.print("Reversed Data: ");
        for(int j = 0; j < data.length; j++){
            System.out.print(data[j] + " ");
        }
        System.out.println();
    }
}
