/*
You are given an integer array nums of length n.
A partition is defined as an index i where 0 <= i < n - 1, splitting the array into two non-empty subarrays such that:
Left subarray contains indices [0, i].
Right subarray contains indices [i + 1, n - 1].
Return the number of partitions where the difference between the sum of the left and right subarrays is even.
*/





class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for(int x : nums) {
            total += x; 
        }
        int left = 0;
        int ans = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            left += nums[i];            
            int right = total - left;    

            if ((Math.abs(left - right) % 2) == 0) {
                ans++;
            }
        }

        return ans;
    }
}
