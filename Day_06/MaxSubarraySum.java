// Problem Link: https://www.codingninjas.com/studio/problems/maximum-subarray-sum_630526

public class MaxSubarraySum {
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum = 0, max = Long.MIN_VALUE;
		for(int i=0; i<n; i++){
			sum += arr[i];
			if(sum > max) max = sum;
			if(sum < 0) sum = 0;
		}
		return max>0? max : 0;
	}
}

// Problem Link: https://leetcode.com/problems/maximum-subarray/description/

class MaxSubarraySum {
    public int maxSubArray(int[] nums) {
        int n = nums.length, sum = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
        }
        return max;
    }
}