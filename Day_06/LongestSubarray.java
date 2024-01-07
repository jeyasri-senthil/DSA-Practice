// Problem Link: https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399

public class LongestSubarray {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int length = 0;
        for(int i=0; i<a.length; i++){
            long sum = 0;
            for(int j=i; j<a.length; j++){
                sum += a[j];
                if(sum == k) length = Math.max(length, j-i+1);
            }
        }
        return length;
    }
}

// Problem Link: https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505

import java.util.* ; 
public class LongestSubarray {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int length = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            map.put(0, -1);
            if(!map.containsKey(sum)) map.put(sum, i);
            if(map.containsKey(sum-k)) length = Math.max(length, i-map.get(sum-k));
        }
        return length;
	}
}
