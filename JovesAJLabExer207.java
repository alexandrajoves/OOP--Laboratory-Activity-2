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
public class JovesAJLabExer207 {
     public static void main ( String[] args ) throws IOException 
     {   
         int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
         
         int largest1 = 0;
         int largest2 = 0;
         
         for(int index = 0; index < data.length; index++){
             if ( data [index]  > largest1) {
                 largest1 = largest2;
                 largest1 = data[index];
                 }
             
         }
  
     }
}      
    
