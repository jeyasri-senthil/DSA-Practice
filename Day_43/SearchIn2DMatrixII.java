// Problem Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/

// Brute Force Solution
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++) {
            boolean out = binarySearch(matrix[i], target);
            if(out) return true;
        }
        return false;
    }
    public static boolean binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        if(nums[0] <= target && target <= nums[high]) {
            while(low <= high) {
                int mid = (low + high) / 2;
                if(nums[mid] == target) return true;
                else if(nums[mid] < target) low = mid+1;
                else high = mid-1;
            }
        }
        return false;
    }
}

// Optimal Solution
int n = matrix.length, m = matrix[0].length, row = 0, col = m-1;
        while(row < n && col >= 0) {
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) row++;
            else col--;
        }
        return false;
