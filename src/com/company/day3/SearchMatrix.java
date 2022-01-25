package com.company.day3;

import com.company.Helper;

import java.util.ArrayList;
import java.util.List;

public class SearchMatrix {
    public static boolean solution(int[][] matrix,int target) {
       if(matrix.length == 0) return false;
       int rows = matrix.length;
       int cols = matrix[0].length;

       int left = 0;
       int right = rows * cols - 1;

       while(left <= right){
           int mid = left + (right - left) / 2;
           int mid_elem = matrix[mid/cols][mid%cols];
           if(mid_elem == target) return true;
           else if(target < mid_elem ) right = mid - 1;
           else if (target > mid_elem) left = mid + 1;
       }
       return false;
    }

    public static void test(){
        int target = 7;
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println("Before");
        Helper.printMatrix(matrix);
        System.out.println("After");
        boolean res;
        res = solution(matrix,target);
        System.out.println(res);
    }
}
