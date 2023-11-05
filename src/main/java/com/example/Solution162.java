package com.example;

public class Solution162 {
    public static void main(String[] args) {
        int [] nums = {3,4,3,2,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int [] nums){
        int start = 0;
        int end = nums.length-1;

        //只有一位
        if (nums.length == 1){
            return 0;
        }

        //第一位或者最后一位
        if (nums[0]>nums[1])return 0;
        if (nums[nums.length-1]> nums[nums.length-2]) return nums.length-1;

         start = 1;
         end = nums.length-2;
        while (start <= end){
            int mid = start + (end -start) / 2;
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) return mid;
            if (nums[mid]< nums[mid +1]){
                start = mid +1;
            }
            if (nums[mid] < nums[mid - 1]) end = mid -1;
        }
        return -1;
    }
}
