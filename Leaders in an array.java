
// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&curated[]=1&sortBy=submissions

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        Deque<Integer> ans = new ArrayDeque<>();
        int max = arr[n-1];
        ans.push(max);
        for(int i=n-2; i>=0; i--) {
            if(arr[i]>=max) {
                ans.push(arr[i]);
                max = arr[i];
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(!ans.isEmpty()) {
            res.add(ans.pop());
        }
        return res;
    }
}