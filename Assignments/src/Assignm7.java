
public class Assignm7 {

	public static void main(String[] args) {
		hasTeen(9,99,19);
		hasTeen(23,15,42);
		hasTeen(22,23,34);
	

	}
	public static void hasTeen(int num1, int num2, int num3) {
		if(num1>=13 && num1<=19 || num2>=13 && num2<=19 || num3>=13 && num3<=19) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
