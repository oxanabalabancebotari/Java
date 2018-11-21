
public class CalcInterest {

	public static void main(String[] args) {
		//How much is the interest for the amount of $10000 and %2 interest rate
		//How much is the interest for the amount of $10000 and %3 interest rate
		//How much is the interest for the amount of $10000 and %4 interest rate
		//How much is the interest for the amount of $10000 and %5 interest rate
		System.out.println(calculateINTEREST(10000,2));
		System.out.println(calculateINTEREST(10000,3));
		System.out.println(calculateINTEREST(10000,4));
		System.out.println(calculateINTEREST(10000,5));
		
		System.out.println("____________________");
		for(int i=2; i<6; i++) {
			System.out.println(calculateINTEREST(10000, i));
		}

	}
	public static double calculateINTEREST(double amount, double interestRate) {
		return amount*(interestRate/100);
		
	}

}
