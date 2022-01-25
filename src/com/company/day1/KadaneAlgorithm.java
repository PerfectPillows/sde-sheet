package com.company.day1;

public class KadaneAlgorithm {

    public static int solution(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;

        for(int i = 0; i < nums.length; i++){
            if(curSum < 0){
                curSum = 0;
            }
            curSum += nums[i];
            maxSub = Math.max(maxSub,curSum);

        }

        return maxSub;
    }

    public static void test(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution(nums));
    }
}
