import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int count=1;
		int i=1;
		while(count<=n){
			int x=3*i+2;
			if (x%4!=0){
				System.out.print(x+" ");
				count++;
			}
			i++;

		}
		
	}
}
