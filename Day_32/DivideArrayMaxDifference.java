// Problem Link: https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int len = nums.length;
        if(len % 3 != 0) return new int[][]{};
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int arrIndex = 0;
        for(int i=0; i<len; i=i+3) {
            if(i+2 <= len && nums[i+2]-nums[i] <= k) {
                list.add(new ArrayList<>(Arrays.asList(nums[i], nums[i+1], nums[i+2])));
                arrIndex++;
            }
            else return new int[][]{};
        }
        int[][] result = new int[list.size()][3];
        for(int i=0; i<list.size(); i++) {
            ArrayList<Integer> sublist = list.get(i);
            for(int j = 0; j < 3; j++) {
                result[i][j] = sublist.get(j);
            }
        }
        return result;
    }
}
