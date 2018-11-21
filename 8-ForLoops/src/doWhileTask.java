
public class doWhileTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(sumDigits(125));
  System.out.println(sumDigits(-125));
  System.out.println(sumDigits(500));
	}
	public static int sumDigits (int number ) {

		if(number<10) {
			return -1;
		}
		int sum=0;
		while(number>0) {
			int digit=number%10;
			sum+=digit;
			number=number/10;
			
			
		}
		return sum;
	}

}
