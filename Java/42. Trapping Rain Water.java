/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
*/


class Solution {
    public int trap(int[] height) {
        //left max boundary
        int leftMax[]=new int[height.length];
    leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //right max boundary
        int rightMax[]=new int[height.length];
    rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //water level
        int tw=0;
        for(int i=0;i<height.length;i++){
           int waterlevel=Math.min(leftMax[i],rightMax[i]);
            tw+=waterlevel-height[i];
        }
        return tw;
    }
}
