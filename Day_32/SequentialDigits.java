// Problem Link: https://leetcode.com/problems/sequential-digits/

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=9; i++) {
            int num = i;
            int nextNum = i+1;
            while(num <= high && nextNum <= 9) {
                num = num * 10 + nextNum;
                if(low <= num && num <= high) list.add(num);
                nextNum++;
            }
        }
        Collections.sort(list);
        return list;
    }
}
