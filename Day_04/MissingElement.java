// Problem Link: https://leetcode.com/problems/missing-number/description/

// Brute-Force Solution
class MissingElement {
    public int missingNumber(int[] nums) {
        for(int i=0; i<=nums.length; i++){
            int flag = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }
}
