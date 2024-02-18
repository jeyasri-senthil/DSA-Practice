// Problem Link: https://www.interviewbit.com/problems/max-distance/

import java.util.*;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        int n = A.length;
        if(n < 2) return 0;
        int[] lMin = new int[n];
        int[] rMax = new int[n];
        lMin[0] = A[0];
        for(int i=1; i<n; i++) lMin[i] = Math.min(A[i], lMin[i-1]);
        rMax[n-1] = A[n-1];
        for(int i=n-2; i>=0; i--) rMax[i] = Math.max(A[i], rMax[i+1]);
        int i=0, j=0, max = 0;
        while(i<n && j<n) {
            if(lMin[i] <= rMax[j]) {
                max = Math.max(max, j-i);
                j++;
            }
            else i++;
        }
        return max;
    }
}
