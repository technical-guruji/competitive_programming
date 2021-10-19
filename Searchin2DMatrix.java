// https://leetcode.com/problems/search-a-2d-matrix

import java.util.Scanner;

public class Searchin2DMatrix {

    static boolean searchMatrix(int[][] matrix, int target) {

        /* Naive Approach */
//        int m = matrix.length;
//        int n = matrix[0].length;
//        for(int i = 0; i < m; i++) {
//            for(int j = 0; j < n; j++) {
//                if(matrix[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;

        /* Best Approach - Binary Search */
        if(matrix == null || matrix.length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0, end = rows * cols - 1, mid;

        while(start <= end) {
            mid = (start+end)/2;
            if(matrix[mid/cols][mid%cols] == target)
                return true;

            if(matrix[mid/cols][mid%cols] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;

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

        int target = sc.nextInt();

        boolean result = searchMatrix(matrix, target);
        System.out.println(result);

    }
}
