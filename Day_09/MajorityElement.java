// Problem Link: https://leetcode.com/problems/majority-element/description/
// Problem Link: https://www.codingninjas.com/studio/problems/majority-element_6783241

// BruteForce Solution
class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]) count++;
            }
            if(count > (nums.length/2)) return nums[i];
        }
        return -1;
    }
}

// Better Solution
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count+1);
        }
        for(Map.Entry<Integer, Integer> iterator : map.entrySet()){
            if(iterator.getValue() > (nums.length/2)) return iterator.getKey();
        }
        return -1;
    }
}

// Optimal Solution
// Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length, count = 0, element = 0;
        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(element == nums[i]) count++;
            else count--;
        }
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == element) count1++;
        }
        if(count1 > n/2) return element;
        return -1;
    }
}
