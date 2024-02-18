// Problem Link: https://www.interviewbit.com/problems/wave-array/

public class Solution {
    public int[] wave(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        for(int i=0; i<n-1; i=i+2) {
            int temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp;
        }
        return A;
    }
}
