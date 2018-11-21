
public class Assignm6 {

	public static void main(String[] args) {
		hasEqualSum(1,1,1);
		hasEqualSum(1,1,2);
		hasEqualSum(1,-1,0);
	

	}
	public static void hasEqualSum(int num1, int num2, int num3) {
		if(num1+num2==num3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
