// Problem Link: https://leetcode.com/problems/isomorphic-strings/description/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length(), m = t.length();
        if (n != m) return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if(!map.containsKey(key)) {
                if(!map.containsValue(value)) {
                    map.put(key, value);
                }
                else return false;
            }
            else {
                char temp = map.get(key);
                if(temp != value) return false;
            }
        }
        return true;
    }
}
