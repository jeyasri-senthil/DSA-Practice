// Problem Link: https://leetcode.com/problems/count-binary-substrings/

class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0, prev = 0, curr = 1, n = s.length();
        for(int i=1; i<n; i++) {
            if(s.charAt(i-1) == s.charAt(i)) curr++;
            else {
                ans = ans + Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        return ans + Math.min(prev, curr);
    }
}
