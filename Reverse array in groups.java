
// https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&curated[]=1&sortBy=submissions

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i=0;
        while (i<n) {
            int left = i;

            // handling right if k is not a multiple of n
            int right = Math.min(i+k-1, n-1);

            while(left<right) {
                // swap fuction
                Integer temp = arr.get(right);
                arr.set(right, arr.get(left));
                arr.set(left, temp);

                left += 1;
                right -= 1;
            }
            i += k;
        }
    }
}