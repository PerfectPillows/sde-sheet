package com.company.day2;

import com.company.Helper;

public class RotateMatrix {
    public static void solution(int[][] matrix) {
        //transpose
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2 ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void test(){
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println("Before");
        Helper.printMatrix(matrix);
        solution(matrix);
        System.out.println("After");
        Helper.printMatrix(matrix);
    }
}
