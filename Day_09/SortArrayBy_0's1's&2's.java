// Problem Link: https://www.codingninjas.com/studio/problems/sort-an-array-of-0s-1s-and-2s_892977
// Problem Link: https://leetcode.com/problems/sort-colors/description/

// Brute-Force Solution: Merge Sort

// Better Solution
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> nums, int n) {
        // Write your code here.
        int count0 = 0, count1 =0, count2 = 0;
        for(int i=0; i<n; i++){
            if(nums.get(i)==0) count0++;
            else if(nums.get(i)==1) count1++;
            else count2++;
        }
        nums.clear();
        for(int i=0; i<count0; i++) nums.add(0);
        for(int i=count0; i<count0+count1; i++) nums.add(1);
        for(int i=count0+count1; i<n; i++) nums.add(2);
    }
}

// Optimal Solution
// Dutch National Flag algorithm
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int mid = 0, low = 0, high = n-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                mid++;
                low++;
            }
            else if(arr.get(mid)==1) mid++;
            else{
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }
}
