
public class Task {
	public static void main(String[] args) {
//		int i1= 90;
//		if(i1<60) {
//			System.out.println("Fail");
//		}else if(i1>=60 && i1<90) {
//			System.out.println("Pass");
//		}else if (i1>=90) {
//			System.out.println("Passed with Distinction");
//		};
		
		long tax= 1000000000l;
		int result = (int)(tax*0.25);
		int result1 = (int)(tax*0.30);
		int result2 = (int)(tax*0.35);
		int result3 = (int)(tax*0.40);
		int result4 = (int)(tax*0.50);
		
		if(tax<= 150000000) {
			System.out.println("Your tax ratio is 30% which is "+ result);
		}else if(tax<= 300000000) {
			System.out.println("Your tax ratio is 30% which is "+ result1);
		}else if(tax<= 600000000) {
			System.out.println("Your tax ratio is 35% which is "+ result2);
		}else if(tax<= 1200000000) {
			System.out.println("Your tax ratio is 40% which is "+ result3);
		}else if(tax> 1200000000) {
			System.out.println("Your tax ratio is 50% which is "+ result4);
		}
		
		
	}

}
