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

// Optimal Solution 1
class MissingElement {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0; i<=nums.length; i++){
            sum += i;
        }
        int arrSum = 0;
        for(int i=0; i<nums.length; i++){
            arrSum += nums[i];
        }
        int result = sum - arrSum;
        return result;
    }
}

// Optimal Solution 2
class MissingElement {
    public int missingNumber(int[] nums) {
        int XOR1 = 0;
        for(int i=0; i<=nums.length; i++){
            XOR1 = XOR1^i;
        }
        int XOR2 = 0;
        for(int i=0; i<nums.length; i++){
            XOR2 ^= nums[i];
        }
        int result = XOR1^XOR2;
        return result;
    }
}
