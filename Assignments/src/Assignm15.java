import java.util.Scanner;

public class Assignm15 {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));

	}
	public static int sumFirstAndLastDigit(int number) {
		
		
		Scanner scanner= new Scanner(System.in);
		if(number>=0) {
	
		
		int firstDigit=0;
		int lastDigit=0;
		int sum=0;
		firstDigit=number;
		while(firstDigit>10) {
			firstDigit=(firstDigit/10);
		}
		lastDigit=(number%10);
		sum = firstDigit+lastDigit;
		return sum;
		}else {
			return -1;
		}
		
	}

}
