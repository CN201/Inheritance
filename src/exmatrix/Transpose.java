/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exmatrix;

/**
 *
 * @author Chotikarn
 */
public class Transpose extends ComplexMatrix {
    
    
    public void PrintTranspose(ComplexMatrix a[][]){  
    int i,j;
     ComplexMatrix b[][] = new ComplexMatrix[SIZE][SIZE];
        //Print current matrix
        System.out.println("Given matrix");
        for (i=0; i<3; i++) 
        {
            for (j=0; j<3; j++) 
            {
                
                System.out.print(a[i][j]+"") ;      
            }   
             System.out.println(); 
        }
        System.out.println("Transpose");
         for (j=0; j<3; j++) 
        {
            for (i=0; i<3; i++) 
            {
                b[j][i] = a[i][j];
                 System.out.print(b[j][i]+"") ;
            }System.out.println(); 
        }
    }  
}
