// Problem Link: https://leetcode.com/problems/rotate-string/description/

class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}
