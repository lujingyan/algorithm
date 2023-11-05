package com.example;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int a:nums){
            if(a != 0){
                nums[i]=a;
                i++;
            }
        }

        while (i <= nums.length-1){
            nums[i]=0;
            i++;
        }
    }
}
