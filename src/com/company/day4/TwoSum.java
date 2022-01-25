package com.company.day4;

import com.company.Helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static List<Integer> solution(int[] nums,int target) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)) {

                res.add(map.get(diff));
                res.add(i);
                return res;
            }
            else {
                map.put(nums[i],i);
            }
        }

        return res;
    }


    public static void test(){
        int[] nums = {2,7,11,15};
        int target = 9;
        List<Integer> res = new ArrayList<>();
        res = solution(nums,target);
        Helper obj = new Helper();
        obj.printList(res);
    }
}
