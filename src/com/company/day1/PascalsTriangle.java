package com.company.day1;

import com.company.Helper;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> solution(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row,prev = null;
        if(numRows == 0) return res;

        for(int i = 0; i < numRows; i++){
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) row.add(1);
                else row.add(prev.get(j - 1) + prev.get(j));
            }
            prev = row;
            res.add(row);
        }

        return res;

    }

    public static void test(){
        List<List<Integer>> pascals_Triangle = solution(5);
        Helper<Integer> obj = new Helper<Integer>();
        obj.printMatrix(pascals_Triangle);

    }
}
