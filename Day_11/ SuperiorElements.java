// Problem Link: https://www.codingninjas.com/studio/problems/superior-elements_6783446

// BruteForce Solution
import java.util.*;
public class Solution {
    public static List<Integer> superiorElements(int []a) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            boolean leader = true;
            for(int j=i+1; j<a.length; j++){
                if(a[i] <= a[j]){
                    leader = false;
                    break;
                }
            }
            if(leader == true) ans.add(a[i]);
        }
        Collections.sort(ans);
        return ans;
    }
}

// Optimal Solution
import java.util.*;
public class Solution {
    public static List<Integer> superiorElements(int []a) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=a.length-1; i>=0; i--){
            if(a[i] > max){
                max = a[i];
                ans.add(a[i]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
