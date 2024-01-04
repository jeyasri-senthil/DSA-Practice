// Problem Link: https://www.codingninjas.com/studio/problems/sorted-array_6613259

import java.util.*;
public class MergeSortedArray {
    public static List<Integer> sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0, n1 = a.length, n2 = b.length;
        while(i<n1 && j<n2){
            if(a[i] <= b[j]){
                if(union.size()==0 || !union.contains(a[i])){
                    union.add(a[i]);
                }
                i++;
            }
            else{
                if(union.isEmpty() || !union.contains(b[j])){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(union.size()==0 || !union.contains(a[i])){
                union.add(a[i]);
            }
            i++;
        }
        while(j<n2){
            if(union.isEmpty() || !union.contains(b[j])){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
}