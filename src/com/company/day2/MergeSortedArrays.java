package com.company.day2;

import com.company.Helper;
//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArrays {
    public static void solution(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int k = 0;
        int i,j;
        i = 0;
        j = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                res[k++] = nums1[i];
                i++;
            }
            else {
                res[k++] = nums2[j];
                j++;
            }
        }

        while(i < m){
            res[k++] = nums1[i++];
        }

        while( j < n){
            res[k++] = nums2[j++];
        }

        for(int s=0;s<m+n;s++){
            nums1[s]=res[s];
        }
    }
    //No extra memory needed
    public static void optimized_solution(int[] nums1, int m, int[] nums2, int n){}


    public static void test(){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Helper obj = new Helper();
        System.out.println("Before");
        solution(nums1,3,nums2,3);
        System.out.println("After");
        obj.printArray(nums1);
    }
}
