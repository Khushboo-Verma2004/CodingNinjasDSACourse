import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn= new Scanner (System.in);
		int n=scn.nextInt();
		int c=scn.nextInt();
		if (c==1){
			int sum=0;
			for (int i=1; i<=n;i++){
				sum+=i;
			}
			System.out.print(sum);
		}
		else if(c==2){
			int product=1;
			for (int y=1; y<=n;y++){
				product*=y;
			}
			System.out.print(product);
		}
		else{
			System.out.print("-1");
		}
	}
}
