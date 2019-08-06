/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JovesAJLabActivity102;

/**
 *
 * @author Alexandra
 */
public class JovesAJLabExer202 {
    public static void main(String[] args) 
    
    {
         
         int[] val = {13, -4, 82, 17};     
         int[] twice = {1,1,1,1};  
           
         
    System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
                 for(int i = 0; i < val.length; i++){
                  twice[i] = val[i] * 2;
         }
         
 
    System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }
    
}
