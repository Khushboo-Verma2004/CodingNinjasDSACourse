
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int n=arr.length-1;
        for (int i=0; i<=n ;i+=2){
            if (i+1<=n){
                 int temp= arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
            }
           
        }
    }
}
