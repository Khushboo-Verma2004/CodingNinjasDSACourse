public class Solution {
    public static int[] countS(int n, int m, int []a, int []b) {
        int [] arr = new int[n];
        int k=0;
        
        int i=0;
        
        while(i<n){
            int count=0;
            int j=0;
            while(j<m){
                if(b[j]<a[i]){
                    count++;
                   
                }
                else if(b[j]==a[i]){
                    count++;
                }
                 j++;
               
                
            }
             arr[k]=count;
            i++;
            k++;
            
        }
        
        return arr;
    }
}
