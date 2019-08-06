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
public class JovesAJLabExer204 {
     public static void main ( String[] args )  
     {    
         int[] valA   = { 13, -22,  82,  17};     
         int[] valB   = {  0,   0,   0,   0};        
        
         valB [0] = 25 - valA[0];
         valB [1] = 25 - valA[1];
         valB [2] = 25 - valA[2];
         valB [3] = 25 - valA[3];
       
    
    System.out.println( "valA:" + valA[0] + " " + valA [1] + " " + valA[2] + " " + valA[3]);
    System.out.println( "valB:" + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
    
    System.out.print( "Sum:");
    for (int a = 0; a < valB.length; a++){
            int sum =  valB[a] + valA[a];
            System.out.print(" " +sum );
            
   
     }
}
}    
    

