/*
You are given a string s consisting of lowercase English letters.
Return an integer denoting the maximum number of substrings you can split s into such that each substring starts with a distinct character (i.e., no two substrings start with the same character).
*/

class Solution {
    public int maxDistinct(String s) {
        Set<Character>st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        return st.size();
    }
}
