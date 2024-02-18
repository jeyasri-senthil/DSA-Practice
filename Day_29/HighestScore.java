// Problem Link: https://www.interviewbit.com/problems/highest-score/

public class Solution {
    public int highestScore(String[][] A) {
        HashMap<String, Integer> markSum = new HashMap<>();
        HashMap<String, Integer> markCount = new HashMap<>();
        for(String[] student : A) {
            String name = student[0];
            int mark = Integer.parseInt(student[1]);
            markSum.put(name, markSum.getOrDefault(name, 0) + mark);
            markCount.put(name, markCount.getOrDefault(name, 0) + 1);
        }
        int highestAverage = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : markSum.entrySet()) {
            String name = entry.getKey();
            int sum = entry.getValue();
            int count = markCount.get(name);
            int average = sum / count;
            highestAverage = Math.max(highestAverage, average);
        }
        return highestAverage;
    }
}
