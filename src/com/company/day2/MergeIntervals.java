package com.company.day2;

import com.company.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] solution(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null){
            return res.toArray(new int[0][]);
        }

        Arrays.sort(intervals,(a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i :intervals){
            if(i[0] <= end) end = Math.max(end,i[1]);
            else {
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }

        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);

    }

    public static void test(){
        int[][] matrix = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println("Before");
        Helper.printMatrix(matrix);
        matrix = solution(matrix);
        System.out.println("After");
        Helper.printMatrix(matrix);
    }
}
