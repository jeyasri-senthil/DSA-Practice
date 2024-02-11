// Problem Link: https://www.interviewbit.com/problems/occurence-of-each-number/

public class Solution {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        int n = A.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int count = map.getOrDefault(A.get(i), 0);
            map.put(A.get(i), count+1);
        }
        Map<Integer, Integer> treeMap = new TreeMap<>(map);
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: treeMap.entrySet()) list.add(entry.getValue());
        return list;
    }
}
