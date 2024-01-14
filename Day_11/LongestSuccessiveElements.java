// Problem Link: https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740
// Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/description/

// BruteForce Solution
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int longest = 1;
        for(int i=0; i<a.length; i++){
            int num = a[i], count = 1;
            while(linearSearch(a, num+1) == true){
                num = num+1;
                count = count+1;
            }
            if(count > longest) longest = count;
        }
        return longest;
    }
    public static boolean linearSearch(int[] a, int num){
        for(int i=0; i<a.length; i++){
            if(a[i]==num) return true;
        }
        return false;
    }
}

// Better Solution
import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int i=0; i<a.length; i++) set.add(a[i]);
        for(int iterator : set){
            if(!set.contains(iterator-1)){
                int count = 1;
                int firstElement = iterator;
                while(set.contains(firstElement+1)){
                    count = count+1;
                    firstElement = firstElement+1;
                }
                longest = Math.max(longest, count);
            }
        }  
        return longest;
    }
}

// Optimal Solution
import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int longest = 1, curCnt = 0, lastSmallest = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]-1 == lastSmallest){
                curCnt = curCnt+1;
                lastSmallest = a[i];
            }
            else if(a[i] != lastSmallest){
                curCnt = 1;
                lastSmallest = a[i];
            }
            longest = Math.max(longest, curCnt);
        }   
        return longest;
    }
}
