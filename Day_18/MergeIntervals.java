// Problem Link: https://www.codingninjas.com/studio/problems/merge-all-overlapping-intervals_6783452

import java.util.*;
public class Solution {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr){
        // Write your code here.
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else {
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), arr[i][1]));
            }
        }
        return ans;
    }
}

// Problem Link: https://leetcode.com/problems/merge-intervals/description/

class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else {
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), arr[i][1]));
            }
        }
        int[][] result = new int[ans.size()][2];
        for(int i=0; i<ans.size(); i++) {
            List<Integer> interval = ans.get(i);
            result[i][0] = interval.get(0);
            result[i][1] = interval.get(1);
        }
        return result;
    }
}
