// https://leetcode.com/problems/reshape-the-matrix

import java.util.Scanner;

public class ReshapeMatrix {

    static int[][] matrixReshape(int[][] matrix, int r, int c) {

        /* Naive Approach */
//        int m = matrix.length; // find total no. of rows
//        int n = matrix[0].length; // find total no. of cols
//
//        if(r*c != m*n) {
//            return matrix;
//        }
//
//        int[][] res = new int[r][c];
//
//        for(int i = 0, k = 0, l = 0; i < m; i++) {
//            for(int j = 0; j < n; j++, l++) {
//                if(l == c) {
//                    k++;
//                    l = 0;
//                }
//                res[k][l] = matrix[i][j];
//            }
//        }
//        return res;

        /* Best Approach */
        int m = matrix.length; // find total no. of rows
        int n = matrix[0].length; // find total no. of cols

        if(r*c != m*n) {
            return matrix;
        }

        int[][] res = new int[r][c];

        for(int i = 0; i < m*n; i++) {
            res[i/c][i%c] = matrix[i/n][i%n];
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int reshape_row = sc.nextInt();
        int reshape_col = sc.nextInt();

        int[][] result = new int[reshape_row][reshape_col];

        result = matrixReshape(matrix, reshape_row, reshape_col);

        for(int i = 0; i < reshape_row; i++) {
            for(int j = 0; j < reshape_col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
