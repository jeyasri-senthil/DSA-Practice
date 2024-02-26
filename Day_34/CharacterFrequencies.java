// Problem Link: https://www.interviewbit.com/problems/character-frequencies/

public class Solution {
    public int[] solve(String A) {
        LinkedHashMap<Character, Integer>map = new LinkedHashMap<>();
        for(int i=0; i<A.length(); i++) {
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i), 0)+1);
        }
        int[] result = new int[map.size()];
        int j = 0;
        for(Map.Entry<Character, Integer> i : map.entrySet()) {
            result[j++] = i.getValue();
        }
        return result;
    }
}
