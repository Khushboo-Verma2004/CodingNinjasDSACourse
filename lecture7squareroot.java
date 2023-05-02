import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count=0;
		int i=0;
		
		while (i*i<=n){
			count=i;
			i++;
		}
		System.out.println(count);
			
		

	}
}
