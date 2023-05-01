import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findGcd(int x, int y) {
		// Write your code here
		if (x>=y){
			for (int i =x; i<=x; i--){
				if (x%i==0 && y%i==0){
			    return (i);
				}
			}
		}
		if (y>=x){
			for (int i =y; i<=y; i--){
				if (x%i==0 && y%i==0){
			    return (i);
				}
			}
		}
		return(0);
	}
}
	
