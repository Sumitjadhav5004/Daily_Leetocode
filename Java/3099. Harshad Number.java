
/*
An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.
*/

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=x;
        int sum=0;
        while(x!=0){
            int digit=x%10;
            sum+=digit;
            x=x/10;
        }
        if(num%sum==0){
            return sum;
        }

        return -1;

    }
}
