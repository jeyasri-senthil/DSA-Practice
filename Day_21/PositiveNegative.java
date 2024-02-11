// Problem Link: https://www.interviewbit.com/problems/positive-negative/

public class Solution {
    public int[] solve(int[] A) {
        int n = A.length, positiveCount = 0, negativeCount = 0;
        for(int i=0; i<n; i++) {
            if(A[i] > 0) positiveCount++;
            else if(A[i] < 0) negativeCount++;
        }
        return new int[]{positiveCount, negativeCount};
    }
}
