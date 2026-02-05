/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
*/



class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()>goal.length()||s.length()<goal.length()){
            return false;
        }

        StringBuilder sb=new StringBuilder("");
        sb.append(s);
        sb.append(s);

        String str=sb.toString();

        return str.contains(goal);
        
    }
}
