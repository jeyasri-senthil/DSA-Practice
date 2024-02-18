// Problem Link: https://www.interviewbit.com/problems/next-similar-number/

public class Solution {
    public String solve(String A) {
        int n = A.length();
        char[] charArr = A.toCharArray();
        int index = -1;
        for(int i=n-2; i>=0; i--) {
            if(charArr[i] < charArr[i+1]) {
                index = i;
                break;
            }
        }
        if(index == -1) return "-1";
        int nextIndex = -1;
        for(int i=n-1; i>index; i--) {
            if(charArr[i] > charArr[index]) {
                nextIndex = i;
                break;
            }
        }
        char temp = charArr[index];
        charArr[index] = charArr[nextIndex];
        charArr[nextIndex] = temp;
        Arrays.sort(charArr, index+1, n);
        return new String(charArr);
    }
}
