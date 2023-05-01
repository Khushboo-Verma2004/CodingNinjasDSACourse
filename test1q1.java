import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		
		
		for (int i=1; i<=n; i++){
			int a=n-i+1;
			for (int j=1; j<=n; j++){
				if (j==a){
					System.out.print("*");
					a++;
				}
				else{
					System.out.print(n+1-j);

				}
				

			}
			System.out.println();
		}
		// Write your code here

	}
}
