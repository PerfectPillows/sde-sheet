package com.company.day1;

import com.company.Helper;

import java.util.Arrays;

public class SetZeroes {

    //using extra space
    public static void solution(int[][] matrix){
        int rows, cols;
        rows = matrix.length;
        cols = matrix[0].length;

        int[] row_dummy_matrix = new int[rows];
        int[] col_dummy_matrix = new int[cols];

        Arrays.fill(row_dummy_matrix,-1);
        Arrays.fill(col_dummy_matrix,-1);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols ; j++){
                if(matrix[i][j] == 0) {
                    row_dummy_matrix[i] = 0;
                    col_dummy_matrix[j] = 0;
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(row_dummy_matrix[i] == 0 || col_dummy_matrix[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //solution without using extra space
    public static void solution_optimized(int[][] matrix){}



    public static void test(){
        int[][] matrix = {{1,1,1},
                          {1,0,1},
                          {1,0,1}};
        System.out.println("Before");
        Helper.printMatrix(matrix);
        solution(matrix);
        System.out.println("After");
        Helper.printMatrix(matrix);

    }

}
