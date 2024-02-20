// Problem Link: https://www.interviewbit.com/problems/step-by-step/

public class Solution {
    public int solve(int A) {
        A = Math.abs(A);
        int i=0, sum=0;
        while(sum < A) {
            i++;
            sum += i;
        }
        while((sum-A)%2 != 0) {
            i++;
            sum += i;
        }
        return i;
    }
}
