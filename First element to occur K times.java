
/*
@link https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=1&curated[]=1&sortBy=submissions
@author - Pradhumn Porwal
*/

class Solution
{
    public int firstElementKTime(int[] a, int n, int k) {
        // map to store indexes
        HashMap<Integer, ArrayList<Integer>> indexMap = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(!indexMap.containsKey(a[i])){
                indexMap.put(a[i], new ArrayList<Integer>(Arrays.asList(i)));
            }
            else {
                indexMap.get(a[i]).add(i);
            }
        }
        // System.out.print(indexMap);
        int indexOfAns = 99999;
        for(List<Integer> indexes: indexMap.values()) {
            if(indexes.size()>=k && indexes.get(k-1)<indexOfAns) {
                // System.out.print(indexes.get(k-1) + " ");
                indexOfAns = indexes.get(k-1);
                // System.out.print(indexOfAns + " \n");
            }
        }
        if(indexOfAns!=99999) return a[indexOfAns];
        return -1;
    }
}