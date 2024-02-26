// Problem Link: https://www.interviewbit.com/problems/string-inversion/

public class Solution {
    public String solve(String A) {
        char[] charArray = A.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ 32);
        }
        return new String(charArray);
    }
}
