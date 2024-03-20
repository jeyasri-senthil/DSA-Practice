// Problem Link: https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] height) {
        int n = height.length, area = 1, max = Integer.MIN_VALUE, left = 0, right = n-1;
        while(left < right) {
            area = Math.min(height[left], height[right]) * (right - left);
            if(area > max) max = area;
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
