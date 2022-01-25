package com.company.day3;

import com.company.Helper;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_2 {
    public static  List<Integer> solution(int[] nums) {
       int cand1,cand2,count1,count2;
       cand1 = -1;
       cand2 = -1;
       count1 = 0;
       count2 = 0;

       for(int n : nums){
           if(cand1 == n) count1 += 1;
           else if (cand2 == n) count2 += 1;
           else if (count1 == 0) {
               cand1 = n;
               count1 += 1;
           }
           else if (count2 == 0){
               cand2 = n;
               count2 += 1;
           }
           else {
               count1--;
               count2--;
           }
       }

       List<Integer> res = new ArrayList<>();
       count1 = 0;
       count2 = 0;
       for(int n : nums){
           if( cand1 == n) count1++;
           else if( cand2 == n) count2++;
       }

       if(count1 > (nums.length / 3 )) res.add(cand1);
       if(count2  > (nums.length / 3 )) res.add(cand2);

       return res;
    }


    public static void test(){
        int[] nums = {1,2};
        Helper obj = new Helper();
        obj.printList(solution(nums));
    }
}
