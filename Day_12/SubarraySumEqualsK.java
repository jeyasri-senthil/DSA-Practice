// Problem Link: https://leetcode.com/problems/subarray-sum-equals-k/description/
// Problem Link: https://www.codingninjas.com/studio/problems/subarray-sums-i_1467103

// BruteForce Solution
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
}

// Optimal Solution
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0, prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            int remove = prefixSum-k;
            count = count + map.getOrDefault(remove, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}
