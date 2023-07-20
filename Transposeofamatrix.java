import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) {
		int[][]result= new int [n][m];
		int temp;
		for(int i=0; i<m;i++){
			for(int j=0; j<n;j++){
				result[j][i]=mat[i][j];
			}
		}
		return result;
	}

}
