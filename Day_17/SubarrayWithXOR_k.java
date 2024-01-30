// Problem Link: https://www.codingninjas.com/studio/problems/subarrays-with-xor-k_6826258

// Brute-Force Solution
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int count = 0, n = a.length;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int XOR = 0;
                for(int k=i; k<=j; k++) {
                    XOR ^= a[k];
                }
                if(XOR == b) count++;
            }
        }
        return count;
    }
}

// Better Solution
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int count = 0, n = a.length;
        for(int i=0; i<n; i++) {
            int XOR = 0;
            for(int j=i; j<n; j++) {
                XOR ^= a[j];
                if(XOR == b) count++;
            }
        }
        return count;
    }
}

// Optimal Solution
import java.util.*;
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int n = a.length, count = 0, xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xor, 1);
        for(int i=0; i<n; i++) {
            xor ^= a[i];
            int temp = xor^b;
            if(map.containsKey(temp)) count += map.get(temp);
            if(map.containsKey(xor)) map.put(xor, map.get(xor)+1);
            else map.put(xor, 1);
        }
        return count;
    }
}
