/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/


class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int rev=0;
        while(x>0){
            int LastDigit=x%10;
            rev=(rev*10)+LastDigit;
            x=x/10;
        }
        if(original==rev){
            return true;
        }else{
            return false;
        }
        
    }
}
