// Probelm Link: https://leetcode.com/problems/search-a-2d-matrix/

// Brute Force Solution
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}

// Optimal Solution
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length, low = 0, high = (n*m)-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int row = mid/m, col = mid%m;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
