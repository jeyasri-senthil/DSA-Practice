// Problem Link: https://leetcode.com/problems/rotate-array/description/

class K_RotateArray {
    public void rotate(int[] nums, int k) {
        if(k>0){
            int n = nums.length;
            k = k%n;
            reverse(nums, 0, n-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, n-1);
        }
    }
    public void reverse(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}