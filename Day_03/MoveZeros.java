// Problem Link: https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958

// Brute-Force
import java.util.*;
public class MoveZeros {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                temp.add(a[i]);
            }
        }
        for(int i=0; i<temp.size(); i++){
            a[i] = temp.get(i);
        }
        for(int i=temp.size(); i<n; i++){
            a[i] = 0;
        }
        return a;
    }
}

// Problem Link: https://leetcode.com/problems/move-zeroes/description/

// Optimal Solution
class MoveZeros {
    public void moveZeroes(int[] nums) {
        int j = -1, n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j != -1){
            for(int i=j+1; i<n; i++){
                if(nums[i] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
    }
}