// Problem Link: https://www.interviewbit.com/problems/palindrome-integer/

public class Solution {
    public int isPalindrome(int A) {
        int temp = A, rem = 0, rev = 0;
        while(temp > 0) {
            rem = temp % 10;
            rev = rev * 10+ rem;
            temp = temp / 10;
        }
        if(rev == A) return 1;
        else return 0;
    }
}
