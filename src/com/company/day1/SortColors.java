package com.company.day1;


import com.company.Helper;

// https://leetcode.com/problems/sort-colors/
public class SortColors {
    public static void solution(int[] nums) {
      if(nums.length == 0 || nums.length == 1) return;

      int start = 0;
      int end = nums.length - 1;

      int index = 0;

      while (index <= end && start < end){
          if(nums[index] == 0){
              nums[index] = nums[start];
              nums[start] = 0;
              start++;
              index++;
          }
          else if (nums[index] == 2){
              nums[index] = nums[end];
              nums[end] = 2;
              end--;
          }
          else {
              index++;
          }
      }
    }



    public static void test(){
        int[] nums = {0,1,1,0,0,2,1,1,2,0,0};
        Helper obj = new Helper();
        System.out.println("Before");
        obj.printArray(nums);
        solution(nums);
        System.out.println("After");
        obj.printArray(nums);
    }
}
