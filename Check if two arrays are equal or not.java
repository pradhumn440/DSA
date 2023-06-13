
// https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&curated[]=1&sortBy=submissions

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long, Integer> countMapA = new HashMap<Long, Integer>();
        HashMap<Long, Integer> countMapB = new HashMap<Long, Integer>();

        for(int i=0; i<N; i++) {
            if(!countMapA.containsKey(A[i])) countMapA.put(A[i], 1);
            else countMapA.put(A[i], countMapA.get(A[i])+1);
            if(!countMapB.containsKey(B[i])) countMapB.put(B[i], 1);
            else countMapB.put(B[i], countMapB.get(B[i])+1);
        }
        // System.out.print(countMapA + " " + countMapB);
        return countMapA.equals(countMapB);
    }
}