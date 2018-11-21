
public class InchesToCentimeters {

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);
		calcFeetAndInchesToCentimeters(6,0);
		calcFeetAndInchesToCentimeters(-10,0);
		calcFeetAndInchesToCentimeters(0,1);



	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet<0 || inches<0 || inches>12) {
			System.out.println("Invalid feet or inches");
			return -1;	
		}
		double calculate=(feet * 12) * 2.54;
		calculate += inches * 2.54;
		System.out.println("Feet "+feet+" and inches "+inches+" equal centimeters "+calculate);
		return calculate;
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
			return -1;
		}
		double feet = (int)inches / 12 ;
		double remainingInches = (int)inches % 12;
		
		System.out.println(inches  + " inches=" + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
		
	}

}
