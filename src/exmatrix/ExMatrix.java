/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exmatrix;

/**
 *
 * @author phisan
 */
public class ExMatrix {

    /**
     * @param arg   s the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComplexMatrix a = new ComplexMatrix(3);
        ComplexMatrix b = new ComplexMatrix(3);
        a.scanInput();
        b.scanInput();
        ComplexMatrix c = a.add(b);
        ComplexMatrix e = ComplexMatrix.mul(a,b);
        c.printMatrix();
        e.printMatrix();
        

    }
}
