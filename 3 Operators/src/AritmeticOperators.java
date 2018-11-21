
public class AritmeticOperators {
	public static void main(String[] args) {
		
//		int i1=12;
//		int i2=5;
//		float f1=15.5f;
//		double d1=20.5;
//		String msg="Hello";
//		
//		int res1=i1+i2;
//		float res2=i1+f1;
//		double res3=i2+d1;
//		String res4=msg+f1;
		
//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);
//		System.out.println(res4);
//		
		//casting
		byte b1=12; //implicit casting done by java
		int i1=12;
		byte b2=20;
		/*The result of the expresion involving anything int=size or smaller variable is always 
		 * an int. If you add 2 bytes together, you will get an integer
		 * And in case od aritmetic addition,multiplication,substraction,and division of integral 
		 * variables (byte or short) compile processes the value as int, so you need to cast it
		 * 
		 */
		int resByte=b1+b2; //or casting
		byte resByte1= (byte)(b1+b2);
		
		System.out.println(resByte);
		System.out.println(resByte1);
		
		byte res7=126+1;
		byte res8=(byte)(126+19);
		System.out.println(res8);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
