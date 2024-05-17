// Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), start = 0, end = 0, maxLen = Integer.MIN_VALUE;
        if(n == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        while(end < n) {
            char c = s.charAt(end);
            while(set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, end-start+1);
            end++;
        }
        return maxLen;
    }
}
