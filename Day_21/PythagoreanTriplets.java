// Problem Link: https://www.interviewbit.com/problems/pythagorean-triplets/

public class Solution {
    public int solve(int A) {
        int count = 0;
        for(int a=1; a<=A; a++) {
            for(int b=a; b<=A; b++) {
                int c_square = a*a + b*b;
                int c = (int) Math.sqrt(c_square);
                if(c*c == c_square && c <= A) count++;
            }
        }
        return count;
    }
}
