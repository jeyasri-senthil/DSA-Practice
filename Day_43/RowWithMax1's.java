// Problem Link: https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s


// Brute Force Solution
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int maxCount = -1, index = -1;
        for(int i=0; i<n; i++) {
            int cnt = 0;
            for(int j=0; j<m; j++) cnt += arr[i][j];
            if(cnt > maxCount) {
                maxCount = cnt;
                index = i;
            }
        }
        return index;
    }
}

// Optimal Solution
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int maxCnt = -1, index = -1;
        for(int i=0; i<n;  i++) {
            int first = firstOccurrence(arr[i], m);
            if (first != -1) {
                if (maxCnt == -1 || m - first > maxCnt) {
                    maxCnt = m - first;
                    index = i;
                }
            }
        }
        return index;
    }

    public static int firstOccurrence(int[] nums) {
        int low = 0, high = nums.length-1, first = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == 1) {
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < 1) low = mid+1;
            else high = mid-1;
        }
        return first;
    }
}
