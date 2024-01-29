// Problem Link: https://www.codingninjas.com/studio/problems/longest-subarray-with-zero-sum_6783450

import java.util.*;
public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length, sum = 0, max = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            if(sum == 0) max = i+1;
            else {
                if(!map.containsKey(sum)) map.put(sum, i);
                else max = Math.max(max, i-map.get(sum));
            }
        }
        return max;
    }
}
