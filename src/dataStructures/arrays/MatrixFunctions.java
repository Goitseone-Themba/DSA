package dataStructures.arrays;//@author: Goitseone Themba 21000539

public class MatrixFunctions {

    /**
     * prints out the order of a matrix and wether it's a square matrix or not
     * @param matrix
     */
    public static void printOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        System.out.println("That is an " + m + " x " + n + " matrix");
        System.out.println( m == n ? "It is a square matrix" : "It is not a square matrix" );
    }

    public static void isIdentity(int[][] matrix) {

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print("   " + arr[i][j]);
            }
            System.out.print("\n");
        }

        printOrder(arr);
    }
}
