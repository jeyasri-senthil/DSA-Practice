// Problem Link: https://leetcode.com/problems/sort-characters-by-frequency/description/

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b)-map.get(a));
        StringBuilder ans = new StringBuilder();
        for(char c : list) {
            int freq = map.get(c);
            for(int i=0; i<freq; i++) ans.append(c);
        }
        return ans.toString();
    }
}
