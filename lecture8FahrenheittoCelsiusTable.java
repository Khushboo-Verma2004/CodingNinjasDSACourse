public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		for (int i=start; i<=end; i+=step){
			int x = (int)((5.0/9)*(i-32));
			System.out.println(i+" " +x);
		}
		
	}
}
