// Problem Link: https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()) arr[c-'a']++;
        for(char c : t.toCharArray()) arr[c-'a']--;
        for(int i=0; i<26; i++) {
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
