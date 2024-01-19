// Problem Link: https://leetcode.com/problems/majority-element-ii/description/
// Problem Link: https://www.codingninjas.com/studio/problems/majority-element_6915220

// BruteForce Solution
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(list.size() == 0 || list.get(0) != nums[i]) {
                int count = 0;
                for(int j=0; j<n; j++) {
                    if(nums[i] == nums[j]) count++;
                }
                if(count > n/3) list.add(nums[i]);
            }
            if(list.size() == 2) break;
        }
        return list;
    }
}

// Better Solution
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length, min = (int) (n/3)+1;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value+1);
            if(map.get(nums[i]) == min) list.add(nums[i]);
            if(list.size() == 2) break;
        }
        return list;
    }
}

// Optimal Solution
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length, count1 = 0, count2 = 0, element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(count1 == 0 && nums[i] != element2) {
                count1 = 1;
                element1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != element1) {
                count2 = 1;
                element2 = nums[i];
            }
            else if(nums[i] == element1) count1++;
            else if(nums[i] == element2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        count1 = 0; 
        count2 = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == element1) count1++;
            if(nums[i] == element2) count2++;
        }
        int min = (int) (n/3)+1;
        if(count1 >= min) list.add(element1);
        if(count2 >= min) list.add(element2);
        return list;
    }
}
