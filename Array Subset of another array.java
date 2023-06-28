
// https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&curated[]=1&sortBy=submissions

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];


            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }


            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));

        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> map1 = new HashMap<>();
        HashMap<Long, Integer> map2 = new HashMap<>();
        for(int i=0; i<Math.max(m,n); i++) {
            if(i<n) {
                if(!map1.containsKey(a1[i])) {
                    map1.put(a1[i], 1);
                } else {
                    map1.put(a1[i], map1.get(a1[i])+1);
                }
            }
            if(i<m) {
                if(!map2.containsKey(a2[i])) {
                    map2.put(a2[i], 1);
                } else {
                    map2.put(a2[i], map2.get(a2[i])+1);
                }
            }
        }
        // System.out.print(map1+"\n"+map2);
        int count = 0;
        int map1Size = map1.size();
        for(int i=0; i<map2.size(); i++) {
            if(!map1.containsKey(a2[i])) return "No";
            if(map2.get(a2[i])<=map1.get(a2[i])) count++;
        }

        // System.out.print("\n"+map1.size());
        if(map2.size()==count) return "Yes";
        return "No";
    }
}