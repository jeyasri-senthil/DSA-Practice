// Problem Link: https://www.geeksforgeeks.org/problems/sort-in-specific-order2422/1

//User function Template for Java

class Solution {
    public void sortIt(long arr[], long n) {
        //code here.
        ArrayList<Long> odd = new ArrayList<>();
        ArrayList<Long> even = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(arr[i]%2 == 0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        for(int i=0; i<odd.size(); i++) arr[i] = odd.get((odd.size()-1)-i);
        int j=0;
        for(int i=odd.size(); i<n; i++) arr[i] = even.get(j++);
    }
}
