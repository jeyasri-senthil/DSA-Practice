// Problem Link: https://www.codingninjas.com/studio/problems/rotate-array_1230543

import java.util.*;
public class RotateArray {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int[] temp = new int[k];
        for(int i=0; i<k; i++) temp[i] = arr.get(i);
        int[] start = new int[arr.size()];
        for(int i=k; i<arr.size(); i++) start[i-k] = arr.get(i);
        for(int i=arr.size()-k; i<arr.size(); i++){
            start[i] = temp[i-(arr.size()-k)];
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : start){
            ans.add(i);
        }
        return ans;
    }
}
