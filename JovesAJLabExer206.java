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
public class JovesAJLabExer206 {
    
    public static void main ( String[] args ) throws IOException  {    
        
       int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
       int totalSum = 0;
       int evenSum = 0;
       int oddSum = 0;
       
      for ( int index=0; index < data.length; index++){
         if (index % 2 == 0) {
                evenSum += data[index]; } 
         else {
                oddSum += data[index];    
      }
        totalSum = evenSum + oddSum;
        System.out.println("Sum of Even: " + evenSum);
        System.out.println("Sum of Odd: " + oddSum);
        System.out.println("Total Sum: " + totalSum);
      
    }
}       
}       
       
                  
            
  
  

