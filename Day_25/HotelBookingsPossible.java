// Problem Link: https://www.interviewbit.com/problems/hotel-bookings-possible/

public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int n = arrive.size(), count = 0, i = 0, j = 0;
        while(i<n && j<n) {
            if(arrive.get(i) <= depart.get(j)) {
                i++;
                count++;
                if(count > K) return false;
            }
            else {
                j++;
                count--;
            }
        }
        return true;
    }
}
