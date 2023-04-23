public class Solution {
    public static void alphabetPattern(int n) {
        // Write your code here
		for (int i=1; i<=n;i++){ 
			int x=64;
			for (int j=1;j<=i;j++){
				int y=64+n-j+1;
				System.out.print((char)(y));
			}
			System.out.println();
		}
	}
}
