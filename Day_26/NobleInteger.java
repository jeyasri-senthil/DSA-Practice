// Problem Link: https://www.interviewbit.com/problems/noble-integer/

public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        for(int i=0; i<n-1; i++) {
            if(A[i] == A[i+1]) continue;
            if(A[i] == n-i-1) return 1;
        }
        if(A[n-1] == 0) return 1;
        return -1;
    }
}
