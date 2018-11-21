
public class Assignm12 {

	public static void main(String[] args) {
		printNumberInWord(0);
		printNumberInWord(6);
		printNumberInWord(10);

	}
	public static void printNumberInWord(int number) {
		switch(number) {
		case 0:case 1:case 2:case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			System.out.println(number+" is passed with the value of 0");
			break;
			default:
				System.out.println("OTHER");
		}
		
	}

}
