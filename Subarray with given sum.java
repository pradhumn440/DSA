
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&curated[]=1&sortBy=submissions

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        if (s == 0) return new ArrayList<Integer>(Arrays.asList(-1));
        int sum = 0;
        int firstIdx = 0;
        int lastIdx = 0;
        while(lastIdx<n) {
            while(sum+arr[lastIdx]>s) {
                if(firstIdx==lastIdx) break;
                sum-=arr[firstIdx];
                firstIdx+=1;
            }
            sum+=arr[lastIdx];
            if(s==sum) return new ArrayList<Integer>(Arrays.asList(firstIdx+1, lastIdx+1));
            // System.out.print(sum+" "+subArr+"\n");
            lastIdx+=1;
        }
        return new ArrayList<Integer>(Arrays.asList(-1));
    }
}