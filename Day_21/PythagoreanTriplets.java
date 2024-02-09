// Problem Link: https://www.interviewbit.com/problems/pythagorean-triplets/

public class Solution {
    public int solve(int A) {
        int count = 0;
        for(int a=1; a<=A; a++) {
            for(int b=a; b<=A; b++) {
                int c_square = a*a + b*b;
                int c = (int) Math.sqrt(c_square);
                if(c*c == c_square && c <= A) count++;
            }
        }
        return count;
    }
}

// Problem Link: https://www.codingninjas.com/studio/problems/pythagorean-triplets_797917

import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean check(int[] arr) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int iterator : arr) list.add(iterator);
        int n = list.size();
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int c_square = list.get(i)*list.get(i) + list.get(j)*list.get(j);
                int c = (int)Math.sqrt(c_square);
                if(c*c == c_square && list.contains(c)) return true;
            }
        }
        return false;
    }
}
