
// https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&curated[]=1&sortBy=submissions

class Solution {

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        if(n==1) return 1;
        int low = 1;
        int high = n-2;
        int sumLeft = (int) arr[0];
        int sumRight = (int) arr[n-1];
        int counter = 0;
        while(low<=high) {
            if(sumLeft==sumRight && counter==n-3) return low+1;
            if(sumLeft>sumRight) {
                sumRight+=(int) arr[high];
                high--;
                // System.out.print(sumRight+" ");
            } else {
                sumLeft+=(int) arr[low];
                low++;
                // System.out.print(sumLeft+" ");
            }
            counter++;
        }
        return -1;
    }
}