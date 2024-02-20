// Problem Link: https://www.interviewbit.com/problems/divisible-by-60/

public class Solution {
    public int divisibleBy60(int[] A) {
        int n = A.length;
        boolean n1 = false, n2 = false;
        int sum = 0;
        if(n==1 && A[0]==0) return 1;
        for(int i=0; i<n; i++) {
            if(A[i] == 0) n1 = true;
            else if(A[i] != 0 && A[i]%2 == 0) n2 = true;
            sum += A[i];
        }
        if(n1 && n2 && sum%3 == 0) return 1;
        return 0;
    }
}
