package com.company.day2;

public class InversionOfArray {
    public static int merge(int[] arr,int[] temp,int left,int mid,int right){
        int inv_count=0;
        int i = left;
        int j = mid;
        int k = left;
        while((i <= mid-1) && (j <= right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }

        while(i <= mid - 1)
            temp[k++] = arr[i++];

        while(j <= right)
            temp[k++] = arr[j++];

        for(i = left ; i <= right ; i++)
            arr[i] = temp[i];

        return inv_count;
    }

    public static int merge_sort(int[] nums,int[] temp,int left,int right) {
        int mid, inv_count = 0;
        if(right > right){
            mid = (left + right )/2;
            inv_count += merge_sort(nums,temp,left,mid);
            inv_count += merge_sort(nums,temp,mid + 1,right);

            inv_count += merge(nums,temp,left,mid+1,right);
        }
        return inv_count;
    }


    public static void test(){
        int[] nums = {1,3,4,2,3};
        int n = 5;
        int[] temp = new int[n];
        System.out.println(merge_sort(nums,temp,0,n-1));
    }

}
