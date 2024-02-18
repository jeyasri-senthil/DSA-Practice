// Problem Link: https://www.interviewbit.com/problems/armstrong-number/

public class Solution {
    public int solve(int A) {
        int rem = 0, sum = 0;
        int temp = A;
        int digitCount = String.valueOf(A).length();
        while(A > 0) {
            rem = A % 10;
            sum = sum + (int) Math.pow(rem, digitCount);
            A = A / 10;
        }
        if(sum == temp) return 1;
        else return 0;
    }
}
