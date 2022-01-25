package com.company.day2;

import java.util.HashSet;

public class FindDuplicate {
    public static int solution(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while (slow != fast);

        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }


    public static void test(){
        int[] nums = {1,3,4,2,3};
        System.out.println(solution(nums));
    }

}
