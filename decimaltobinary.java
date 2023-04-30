import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long sum=0, b=0;
		while(n>0){
			int c = n%2;
			sum=sum+c*(long)Math.pow(10,b++);
			n=n/2;
		}
		System.out.println(sum);

	}
}
