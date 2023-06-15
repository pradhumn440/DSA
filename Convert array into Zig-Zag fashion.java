
// https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&curated[]=1&sortBy=submissions

class Solution{
    public void zigZag(int a[], int n){
        // Code your solution here.
        int i = 0;
        boolean swtch = true;
        while(i+1<n) {

            // switch for alternate/zig-zag fashion
            if(swtch) {
                // swap func
                if(a[i]>a[i+1]) {
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            else {
                // swap func
                if(a[i]<a[i+1]) {
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            if(swtch) {
                swtch = false;
            }
            else {
                swtch = true;
            }
            i += 1;
        }
        // for(int e : a) {System.out.print(e+" ");}
    }
}