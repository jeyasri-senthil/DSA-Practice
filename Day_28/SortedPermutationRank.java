// Problem Link: https://www.interviewbit.com/problems/sorted-permutation-rank/

public class Solution {
    public int findRank(String A) {
        int n = A.length(), rank = 1;
        int[] fact = new int[n];
        fact[0] = 1;
        for(int i=1; i<n; i++) fact[i] = (i*fact[i-1]) % 1000003;
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=i+1; j<n; j++) {
                if(A.charAt(i) > A.charAt(j)) count++;
            }
            rank = ((int) rank + (int) count * (int) fact[n-i-1]) % 1000003;
        }
        return rank;
    }
}
