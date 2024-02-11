// Problem Link: https://www.interviewbit.com/problems/n3-repeat-number/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
        int n = a.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int count = map.getOrDefault(a.get(i), 0);
            map.put(a.get(i), count+1);
            if(count+1 > (n/3)) return a.get(i);
        }
        return -1;
	}
}
