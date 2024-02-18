// Problem Link: https://www.interviewbit.com/problems/last-digit-k-count/

public class Solution {
    public int solve(int A, int B, int C) {
        for(int i=A; i<=B; i++) {
            if(String.valueOf(C).equals(String.valueOf(i%10))) {
                return (B-i) / 10 + 1;
            }
        }
        return 0;
    }
}
