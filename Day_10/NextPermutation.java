// Problem Link: https://leetcode.com/problems/next-permutation/description/

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, index = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1) Arrays.sort(nums);
        else{
            for(int i=n-1; i>index; i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            reverse(nums, index+1, n-1);
        }
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

// Problem Link: https://www.codingninjas.com/studio/problems/next-greater-permutation_6929564

import java.util.*;
public class Solution {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int n = A.size(), index = -1;
        for(int i=n-2; i>=0; i--){
            if(A.get(i) < A.get(i+1)){
                index = i;
                break;
            }
        }
        if(index == -1) Collections.sort(A);
        else{
            for(int i=n-1; i>index; i--){
                if(A.get(i) > A.get(index)){
                    int temp = A.get(i);
                    A.set(i, A.get(index));
                    A.set(index, temp);
                    break;
                }
            }
            reverse(A, index+1, n-1);
        }
        return A;
    }
    public static void reverse(List<Integer> A, int start, int end){
        while(start < end){
            int temp = A.get(start);
            A.set(start, A.get(end));
            A.set(end, temp);
            start++;
            end--;
        }
    }
}
