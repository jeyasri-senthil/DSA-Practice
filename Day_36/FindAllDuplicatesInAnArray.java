// Problem Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(!set.add(nums[i])) list.add(nums[i]);
        }
        return list;
    }
}
