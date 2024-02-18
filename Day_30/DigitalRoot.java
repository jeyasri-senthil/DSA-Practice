// Problem Link: https://www.interviewbit.com/problems/digital-root/

public class Solution {
    public int solve(int A) {
        int sum = 0;
        while(A >= 10) {
            int rem = A % 10;
            sum = sum + rem;
            A = A / 10 + rem;
        }
        return A;
    }
}
