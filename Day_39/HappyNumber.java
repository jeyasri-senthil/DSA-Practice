// Problem Link: https://leetcode.com/problems/happy-number/description/

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while(n > 0) {
                int rem = n % 10;
                sum = sum + rem * rem;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
