import java.util.*;  
public class Solution {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        int len=(r-l+1)/2; 
        for (int i=0; i<len;i++){
            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            // swap(arr[r],arr[l]);
            r--;
            l++;

        }
        return arr;
    }
}
