// Problem Link: https://www.interviewbit.com/problems/first-missing-integer/

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();
        int[] hash = new int[n+1];
        for(int i=0; i<n; i++) {
            if(A.get(i) > 0 && A.get(i) <= n) hash[A.get(i)]++;
        }
        for(int i=1; i<=n; i++) {
            if(hash[i] == 0) return i;
        }
        return n+1;
    }
}
