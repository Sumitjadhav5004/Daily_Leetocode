
/*
You are given a string s consisting of lowercase English letters.
A substring of s is called balanced if all distinct characters in the substring appear the same number of times.
Return the length of the longest balanced substring of s.
*/




class Solution {

    public static boolean checkBalance(int freq[]){
        int expect=0;
        for(int f:freq){
            if(f==0){
                continue;
            }
            if(expect==0){
                expect=f;
            }else if(f!=expect){
                return false;
            }
        }
        return true;
    }


    public int longestBalanced(String s) {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];

            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                if((j-i+1)>maxlen && checkBalance(freq)){
                    maxlen=j-i+1;
                }
            }


        }
        return maxlen;

        
    }
}
