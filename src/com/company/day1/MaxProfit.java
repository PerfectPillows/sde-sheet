package com.company.day1;

public class MaxProfit {
    public static int solution(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else {
                max = Math.max(max,prices[i] - min);
            }
        }

        return max;
    }

    public static void test(){
        int[] nums = {7,1,5,3,6,4};
        System.out.println(solution(nums));
    }

}
