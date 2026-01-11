/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/

class Solution {
    public int maxSubArray(int[] nums) {

        int maxEnd=nums[0];
        int res=nums[0];

        for(int i=1;i<nums.length;i++){
            maxEnd=Math.max(maxEnd+nums[i],nums[i]);
            res=Math.max(res,maxEnd);
        }

        return res;
        
    }
}
