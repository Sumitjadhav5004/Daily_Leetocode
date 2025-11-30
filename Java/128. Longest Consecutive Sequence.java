/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.

*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int ans = 1;
        int curr = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i - 1]) continue;

            if(nums[i] == nums[i - 1] + 1) {
                curr++;
            }
            else {
                ans = Math.max(ans, curr);
                curr = 1;
            }
        }

        ans = Math.max(ans, curr); 

        return ans;
    }
}
