import java.util.* ;
import java.io.*; 
public class Solution {

	public static void ninjaPuzzle(int n) {
		for (int i=1; i<=n; i++){
			for (int j=1; j<=n; j++){
				if (j<=i-1){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// Write your code here.
	}
}
