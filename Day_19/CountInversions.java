// Problem Link: https://www.codingninjas.com/studio/problems/number-of-inversions_6840276

// Brute-Force Solution
public class Solution {
    public static int numberOfInversions(int[] a, int n) {
        // Write your code here.
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] > a[j]) count++;
            }
        }
        return count;
    }
}

// Optimal Solution
