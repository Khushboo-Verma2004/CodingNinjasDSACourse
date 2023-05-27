public class Solution {
    public static int search(int []nums, int target) {
        //Your code goes here
        int start=0;
        int end=nums.length-1;
        while (start<=end){
             int mid=(start+end)/2;
             if (nums[mid]==target){
                 return (mid);
                }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else if (nums[mid]>target){
                end=mid-1;
            }
           


        }
         return (-1);
       
    }

}
