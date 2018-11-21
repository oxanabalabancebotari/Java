
public class Assignm10 {

	public static void main(String[] args) {
		printYearAndDays(525600);
		printYearAndDays(1051200);
		printYearAndDays(561600);
		

	}
	public static long printYearAndDays(long minutes) {
		if(minutes<0) {
			System.out.println("Invalid value");
			return -1;
		}
		long hours=(minutes/60);
		long day=(hours/24);
		long year=(day/365);
		long yearDay=(day%365);
		System.out.println(minutes+" min = "+year+" y and "+yearDay+" d");
		return year;
	}

}
