package com.jetbrains;

/** Program that demonstrates the addition and multiplication of 2 square matrices
 * @author Jeroen Weltens
 */


public class Matrix {
    /** represents the amount of rows and collums of the matrix.*/
    public static int size = 3;
    /** container for the given values of the matrix.*/
    private int[][] m_elements;

    /** prints matrix to stdout.*/
    public void print(){
        for(int i = 0; i < size; ++i){
            System.out.print("[");
            for(int j = 0; j < size; ++j){
                System.out.print(" " + m_elements[i][j]);
                if(j != size - 1){
                    System.out.print(",");
                }
            }
            System.out.print(" ]\n");
        }
    }

    /** method to add up another matrix to this matrix
     * @param m2 the matrix to add to the current matrix
     */
    public void add(Matrix m2){
        for(int i = 0; i < size; ++i){
            for(int j = 0; j < size; ++j){
                m_elements[i][j] += m2.m_elements[i][j];
            }
        }
    }

    /** method to multiply this matrix with another matrix
     * @param m2 the matrix to multiply this matrix with
     */
    public void multiply(Matrix m2){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                int sum = 0;
                for (int s = 0; s < size; s++){
                    sum += m_elements[i][s] * m2.m_elements[s][i];
                }
                m_elements[i][j] = sum;
            }
        }
    }

    /** setter*/
    public void setM_elements(int[][] m_elements) {
        this.m_elements = m_elements;
    }

    /** The main() method of this program
     * hardcoded examples included to showcase the Matrix class
     */
    public static void main() {
        Matrix m1 = new Matrix(), m2 = new Matrix();
        int[][] elems1 = {{1, 2, 3},{4 , 5, 5}, {7, 8, 9}};
        int[][] elems2 = {{8, 3, 6},{7 , 5, 1}, {4, 9, 2}};
        m1.setM_elements(elems1);
        m2.setM_elements(elems2);
        System.out.println("matrix 1:");
        m1.print();
        System.out.println("matrix 2:");
        m2.print();
        System.out.println("matrix 1 += matrix 2:");
        m1.add(m2);
        System.out.println("matrix 1:");
        m1.print();
        System.out.println("matrix 1 *= matrix 2:");
        m1.multiply(m2);
        System.out.println("matrix 1:");
        m1.print();
    }

}
