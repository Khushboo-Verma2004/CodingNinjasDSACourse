public class Solution {  

    public static int secondLargestElement(int[] arr, int n) {
        int largest= Integer.MIN_VALUE;
    	int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length ;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<arr.length ;i++){   
            if(arr[i]==largest){
                continue;
            }
                
           if(arr[i]>secondLargest){
               secondLargest=arr[i];
           }
        }
        return secondLargest;
    }
}
