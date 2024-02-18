// Problem Link: https://www.interviewbit.com/problems/power-of-two-integers/

public class Solution {
    public int isPower(int A) {
        if(A == 1) return 1;
        for(int base=2; base<=Math.sqrt(A); base++) {
            int power = 2;
            int result = (int) Math.pow(base, power);
            while(result <= A) {
                if(result == A) return 1;
                power++;
                result = (int) Math.pow(base, power);
            }
        }
        return 0;
    }
}
