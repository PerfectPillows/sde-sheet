package com.company.day4;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longestSubsequence = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int currentStreak = 1;
                int currentNum = num;
                while(set.contains(currentNum + 1)){
                    currentStreak += 1;
                    currentNum += 1;
                }
                longestSubsequence = Math.max(currentStreak,longestSubsequence);
            }
        }
        return longestSubsequence;
    }


    public static void test(){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(solution(nums));
    }
}
