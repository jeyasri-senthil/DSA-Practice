// Problem Link: https://www.codingninjas.com/studio/problems/find-the-single-element_6680465
// Problem Link: https://leetcode.com/problems/single-number/description/

// BruteForce Solution
public class SingleElement {
    public static int getSingleElement(int []arr){
        // Write your code here.
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == num) count++;
            }
            if(count == 1) return num;
        }
        return -1;
    }
}

// Optimal Solution
public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int XOR = 0;
        for(int i=0; i<arr.length; i++){
            XOR ^= arr[i];
        }
        return XOR;
    }
}
