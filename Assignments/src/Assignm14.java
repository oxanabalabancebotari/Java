
public class Assignm14 {

	public static void main(String[] args) {
		 System.out.println(isPalidrome(1221));
		 System.out.println(isPalidrome(707)); 
		 System.out.println(isPalidrome(11212));


	}
	public static boolean isPalidrome(int number) {
		
		int reverse=0;
		int lastDigit=0;
		int finalDigit;
		finalDigit=number;
		while(number>0) {
			lastDigit= (number%10);
			reverse=(reverse*10)+lastDigit;
			number=number/10;
			
			
			
			
			
			
		}
		if(finalDigit==reverse) {
			return true;
		}else {
			return false;
		}
	}

}
