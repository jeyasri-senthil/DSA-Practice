// Problem Link: https://leetcode.com/problems/two-sum/description/
// Problem Link: https://www.codingninjas.com/studio/problems/reading_6845742

// BruteForce Solution
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

// Better Solution
import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)) 
                return new int[] {map.get(complement), i};
            map.put(nums[i], i);
        }
        return null;
    }
}

// Optimal Solution
import java.util.*;
public class TwoSum {
    public static String read(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
        int i=0, j=n-1;
        while(i<j){
            int sum = book[i]+book[j];
            if(sum < target) i++;
            else if(sum > target) j--;
            else return "YES";
        }
        return "NO";
    }
}