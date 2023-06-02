
public class Solution {
    public static void bubbleSort(int[] arr, int size){
        int temp;
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr.length;j++){
                if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
            
            
        }
    }

}
