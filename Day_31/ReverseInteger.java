// Problem Link: https://www.interviewbit.com/problems/reverse-integer/

public class Solution {
    public int reverse(int A) {
        int sign = (A > 0) ? 1 : -1;
        int rem = 0, temp = Math.abs(A);
        long rev = 0;
        while(temp > 0) {
            rem = temp % 10;
            rev = rev*10 + rem;
            temp = temp / 10;
        }
        long result = rev * sign;
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        return (int) result;
    }
}
