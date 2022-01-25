package com.company.day3;

public class MajorityElement {
    public static int solution(int[] nums) {
      int count = 0;
      int candidate = 0;
      for (int n : nums){
          if(count == 0){
              candidate = n;
          }
          if(n == candidate) count += 1;
          else count -= 1;

      }

      return candidate;
    }


    public static void test(){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(solution(nums));
    }
}
