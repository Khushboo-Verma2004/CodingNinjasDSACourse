import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int reversednum=0;
		// n/10=15
		while (n>0){
			int x = n%10;
			n= n/10;
			reversednum = reversednum* 10 + x ;

		}
		System.out.print(reversednum);
	}
}
