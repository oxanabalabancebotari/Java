
public class Assignm11 {

	public static void main(String[] args) {
		DayOfTheWeek(0);
		DayOfTheWeek(5);
		DayOfTheWeek(9);

	}
	public static void DayOfTheWeek(int day) {
		switch(day) {
	   case 0:
		System.out.println("Sunday");
		break;
	   case 1:
		System.out.println("Monday");
		break;
	   case 2:
		System.out.println("Tuesday");
		break;
	   case 3:
		System.out.println("Wenesday");
		break;
	   case 4:
		System.out.println("Thursday");
		break;
	   case 5:
		System.out.println("Friday");
		break;
	   case 6:
		System.out.println("Saturday");
		break;
		default:
			System.out.println("Invalid day");
			break;
	}
		}
	}


