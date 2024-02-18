// Problem Link: https://www.interviewbit.com/problems/sum-of-7-s-multiple/

public class Solution {
    public long solve(int A, int B) {
        long first = A + (A % 7 == 0 ? 0 : 7 - A % 7);
        long last = B - (B % 7);
        long count = (last - first) / 7 + 1;
        long sum = (count * (first + last)) / 2;
        return sum;
    }
}
