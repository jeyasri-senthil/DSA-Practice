// Problem Link: https://www.interviewbit.com/problems/fizzbuzz/

public class Solution {
    public String[] fizzBuzz(int A) {
        String[] result = new String[A];
        for(int i=0; i<A; i++) {
            if((i+1)%15 == 0) result[i] = "FizzBuzz";
            else if((i+1)%5 == 0) result[i] = "Buzz";
            else if((i+1)%3 == 0) result[i] = "Fizz";
            else result[i] = ""+(i+1);
        }
        return result;
    }
}
