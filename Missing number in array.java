
// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&curated[]=1&sortBy=submissions

class Solution {
    int missingNumber(int array[], int n) {
        //Your Code Here
        int sum = 0;
        int sum1 = (n*(n+1))/2;
        for(int i=0; i<n-1; i++) {
            sum += array[i];
            // sum1 += i+1;
        }
        // sum1 += n;

        // we can also use the formula for sum of n numbers: sum = (n*(n+1))/2
        return sum1-sum;
    }
}