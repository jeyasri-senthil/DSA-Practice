// Problem Link: https://www.codingninjas.com/studio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549

import java.util.*;
public class Solution {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int first = -1, last = -1;
        for(int i=0; i<n; i++) {
            if(arr.get(i) == k) {
                if(first == -1) first = i;
            last = i;
            }
        }
        return new int[]{first, last};
    }
};

// Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                if(first == -1) first = i;
            last = i;
            }
        }
        return new int[]{first, last};
    }
}
