// Problem Link: https://www.interviewbit.com/problems/rotate-matrix/

public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                a.get(j).set(i, temp);
            }
        }
        for(int i=0; i<n; i++) {
            int left = 0, right = n-1;
            while(left < right) {
                int temp = a.get(i).get(left);
                a.get(i).set(left, a.get(i).get(right));
                a.get(i).set(right, temp);
                left++;
                right--;
            }
        }
	}
}
