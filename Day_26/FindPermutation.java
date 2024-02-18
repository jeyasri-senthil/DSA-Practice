// Problem Link: https://www.interviewbit.com/problems/find-permutation/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm (final String A, int B) {
        int n = A.length();
        ArrayList<Integer> list = new ArrayList<>();
        int min = 1, max = B;
        for(int i=0; i<n; i++) {
            if(A.charAt(i) == 'I') {
                list.add(min);
                min++;
            }
            else if(A.charAt(i) == 'D') {
                list.add(max);
                max--;
            }
        }
        list.add(min);
        return list;
    }
}
