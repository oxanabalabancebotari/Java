
public class Assignm13 {

	public static void main(String[] args) {
	  System.out.println(sumOdd(1,100));
	  System.out.println(sumOdd(-1,100));
	  System.out.println(sumOdd(100,100));
	  System.out.println(sumOdd(100,-100));
	  System.out.println(sumOdd(100,1000));

	}
	public static boolean isOdd(int number) {
		if(number%2==1) {
			return true;
			
		}else {
			return false;
		}
	}
	public static int sumOdd(int start, int end) {
		if(end<start || start<=0 || end<=0) {
			return -1;
		}
		int sum=0;
		for(int i=start; i<= end; i++) {
			if(isOdd(i)==true) {
				sum+=i;
				
			}
		}
		return sum;
	
	}

}
