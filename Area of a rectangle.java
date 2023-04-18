import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner scn = new Scanner(System.in);
		int x1=scn.nextInt();
		int y1=scn.nextInt();
		int x2=scn.nextInt();
		int y2=scn.nextInt();
		int area=(x2-x1)*(y2-y1);
		System.out.println(area);

	}

}
