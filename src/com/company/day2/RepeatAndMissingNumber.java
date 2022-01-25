package com.company.day2;

import java.util.HashSet;

public class RepeatAndMissingNumber {
    public static int[] solution(int[] nums) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){ res[1] = n;}
            else set.add(n);
        }

        for(int i = 1; i < nums.length;i++){
            if(!set.contains(i)) res[0] = i;
        }

        return res;
    }
    public static int[] optimized_solution(int[] nums) {
       int[] res = new int[2];
       return res;
    }

    public static void test(){
        int[] nums = {3,1,2,5,3};
        int[] res = solution(nums);
        System.out.println("Repeating Number : " + res[1]);
        System.out.println("Missing Number : " + res[0]);
    }

}
