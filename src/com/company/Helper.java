package com.company;

import java.util.List;

public class Helper<T> {

    public static void printMatrix(int[][] matrix){
        int rows,cols;
        rows = matrix.length;
        cols = matrix[0].length;

        for(int  i = 0; i < rows; i++){
            for(int j = 0; j < cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrix(List<List<T>> matrix){
        for(int i = 0; i < matrix.size() ; i++){
            for(int j = 0; j < matrix.get(i).size(); j++){
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void printArray(int[] nums){
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public void printList(List<T> list){
        for(T elem : list){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
