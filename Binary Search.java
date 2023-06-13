
// https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&curated[]=1&sortBy=submissions

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int left = 0;
        int right = n-1;
        int mid = 0;

        while(left<=right) {
            mid = (left+right)/2;
            if(arr[mid]==k){
                return mid;
            } else if(k>arr[mid]) {
                left = mid+1;
            } else {
                right = mid-1;
            }
            // System.out.print(mid + " ");
        }
        return -1;
    }
}