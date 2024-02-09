// Problem Link: https://www.interviewbit.com/problems/greater-than-all/

public class Solution {
    public int solve(int[] arr) {
        int n = arr.length;
        int count = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(arr[i] > max) {
                count++;
                max = arr[i];
            }
        }
        return max;
    }
}
