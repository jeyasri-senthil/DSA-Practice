// Problem Link: https://www.codingninjas.com/studio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549

// BruteForce Solution
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
}

// Optimal Solution
import java.util.*;
public class Solution {
    public static int[] firstAndLastPosition(ArrayList<Integer> nums, int n, int target) {
        // Write your code here.
        return new int[]{firstOccurrence(nums, n, target), lastOccurrence(nums, n, target)};
    }
    public static int firstOccurrence(ArrayList<Integer> nums, int n, int target) {
        int first = -1, low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums.get(mid) == target) {
                first = mid;
                high = mid-1;
            }
            else if(nums.get(mid) < target) low = mid+1;
            else high = mid-1;
            }
        return first;
    }
    public static int lastOccurrence(ArrayList<Integer> nums, int n, int target) {
        int last = -1, low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums.get(mid) == target) {
                last = mid;
                low = mid+1;
            }
            else if(nums.get(mid) < target) low = mid+1;
            else high = mid-1;
            }
        return last;
    }
}

// Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// BruteForce Solution
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

// Optimal Solution
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurrence(nums, target), lastOccurrence(nums, target)};
    }
    public static int firstOccurrence(int[] nums, int target) {
        int first = -1, low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
            }
        return first;
    }
    public static int lastOccurrence(int[] nums, int target) {
        int last = -1, low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
            }
        return last;
    }
}
