// Problem Link: https://www.geeksforgeeks.org/problems/make-a-distinct-digit-array2007/1

//User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            while(num > 0) {
                set.add(num%10);
                num = num/10;
            }
        }
        int[] result = new int[set.size()];
        int i=0;
        for(int element : set) {
            result[i++] = element;
        }
        Arrays.sort(result);
        return result;
    }
}
