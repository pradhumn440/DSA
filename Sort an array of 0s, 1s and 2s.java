
// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&curated[]=1&sortBy=submissions

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int high = n-1;
        int low = 0;
        int iterator = 0;
        while(iterator<=high) {
            if(a[iterator]==0) {
                //swap
                int temp = a[iterator];
                a[iterator]=a[low];
                a[low]=temp;
                low++;
                iterator++;
            } else if(a[iterator]==2) {
                int temp = a[iterator];
                a[iterator]=a[high];
                a[high]=temp;
                high--;
            } else {
                iterator++;
            }
        }
    }
}