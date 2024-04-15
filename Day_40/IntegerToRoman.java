// Problem Link: https://leetcode.com/problems/integer-to-roman/

class Solution {
    public String intToRoman(int num) {
        int[] key = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] val = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<key.length; i++) {
            while(num >= key[i]) {
                sb.append(val[i]);
                num = num - key[i];
            }
        }
        return sb.toString();
    }
}
