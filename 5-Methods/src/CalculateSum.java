
public class CalculateSum {

	public static void main(String[] args) {
		calculateSum(3,3);
		System.out.println(calculateSum2(5, 5));

	}
	public static void calculateSum(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static int calculateSum2 (int x, int y) {
		int sum= x+y;
		return sum;
	}

}

