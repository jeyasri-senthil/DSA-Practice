// Problem Link: https://www.interviewbit.com/problems/trailing-zeros-in-factorial/

public class Solution {
    public int trailingZeroes(int A) {
        int count = 0;
        while(A > 0) {
            A = A/5;
            count += A;
        }
        return count;
    }
}
