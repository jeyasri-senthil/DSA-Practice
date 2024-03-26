// Problem Link: https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = n-1, i = m-1, k = n+m-1;
        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
        while(i>=0) nums1[k--] = nums1[i--];
        while(j>=0) nums1[k--] = nums2[j--];
    }
}
