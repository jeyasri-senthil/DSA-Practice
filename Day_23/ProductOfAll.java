// Problem Link: https://www.interviewbit.com/problems/product-of-all/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> list = new ArrayList<>();
        int mod = 1000000007;
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        prefix[0] = 1;
        for(int i=1; i<n; i++) {
            prefix[i] = (prefix[i-1] * A.get(i-1)) % mod;
        }
        suffix[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            suffix[i] = (suffix[i+1] * A.get(i+1)) % mod;
        }
        for(int i=0; i<n; i++) {
            long product = (prefix[i]*suffix[i]) % mod;
            list.add((int) product);
        }
        return list;
    }
}
