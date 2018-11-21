
public class Assignm9 {

	public static void main(String[] args) {
		area(5.0);
		area(-1);
		area(5.0,4.0);
		area(-1.0,4.0);

	}
	public static double area( double radius) {
		if(radius<0) {
			System.out.println("-1");
			return -1;
			
		}
		double PI=3.14159;
		double circle=(radius*radius*PI);
		System.out.println(circle);
		return circle;
	} 
	public static double area(double x, double y) {
		if(x<0 || y<0) {
			System.out.println("-1");
			return -1;
			
		}
		double rectangle=(x*y);
		System.out.println(rectangle);
		return rectangle;
	}

}
