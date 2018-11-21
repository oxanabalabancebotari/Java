
public class Assignm4 {

	public static void main(String[] args) {
		bark(true,1);
		bark(false,2);
		bark(true,8);
		bark(true,24);


	}
	public static void bark(boolean barking, int hourOfDay) {
		if(barking==true && hourOfDay<8 && hourOfDay>0 || hourOfDay>22 && hourOfDay<23) {
			System.out.println(true);
		}else if(barking==true && hourOfDay<0 || hourOfDay>23) {
			System.out.println(false);
		}else {
			System.out.println(false);
		}
	}

}
