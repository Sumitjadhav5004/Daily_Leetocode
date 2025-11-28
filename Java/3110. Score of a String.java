
/*
You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
Return the score of s.
*/


class Solution {
    public int scoreOfString(String s) {
        int ans=0;

        for(int i=0;i<s.length()-1;i++){
            int asci1=(int) s.charAt(i);
            int asci2=(int) s.charAt(i+1);
            int diff=Math.abs(asci1-asci2);

            ans+=diff;
        }

        return ans;
    }
}
