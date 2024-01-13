// Problem Link: https://www.codingninjas.com/studio/problems/alternate-numbers_6783445

import java.util.*;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n = a.length;
        List<Integer> posArr = new ArrayList<>();
        List<Integer> negArr = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i] > 0) posArr.add(a[i]);
            else negArr.add(a[i]);
        }
        if(posArr.size() > negArr.size()){
            for(int i=0; i<negArr.size(); i++){
                a[2*i] = posArr.get(i);
                a[2*i+1] = negArr.get(i);
            }
            int index = negArr.size()*2;
            for(int i=negArr.size(); i<posArr.size(); i++){
                a[index++] = posArr.get(i);
            }
        }
        else{
            for(int i=0; i<posArr.size(); i++){
                a[2*i] = posArr.get(i);
                a[2*i+1] = negArr.get(i);
            }
            int index = posArr.size()*2;
            for(int i=posArr.size(); i<negArr.size(); i++){
                a[index++] = negArr.get(i);
            }
        }
    return a;
    }
}
