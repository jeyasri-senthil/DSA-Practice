// Problem Link: https://leetcode.com/problems/reverse-pairs/
// Problem Link: https://www.codingninjas.com/studio/problems/team-contest_6840309

// Brute-Force Solution
class Solution {
    public int reversePairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] > 2*nums[j]) count++;
            }
        }
        return count;
    }
}

// Optimal Solution
import java.util.*;
public class Solution {
    public static int mergeSort(int[] arr, int low, int high){
        if(low < high){
            int count = 0;
            int mid = (low+high)/2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid+1, high);
            count += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
            return count;
        }
        return 0;
    }
    public static int countPairs(int[] arr, int low, int mid, int high){
        int right = mid+1, count = 0;
        for(int i=low; i<=mid; i++){
            while(right <= high && (long)arr[i] > (long)2*arr[right]) right++;
            count += (right - (mid+1));
        }
        return count;
    }
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low; 
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
                temp.add(arr[left]);
                left++;
        }
        while(right<=high){
                temp.add(arr[right]);
                right++;
        }
        for(int i=low; i<= high; i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static int reversePairs(int[] nums){
        // Write your code here.
        return mergeSort(nums, 0, nums.length-1);
    }
}
