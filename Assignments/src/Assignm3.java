
public class Assignm3 {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2050);
		printMegaBytesAndKiloBytes(0);

	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<=0) {
			System.out.println("Invalid Value");
		}else if(kiloBytes>0) {
			double YY= (int)kiloBytes/1024;
			double ZZ= (int)kiloBytes%1024;
			System.out.println(kiloBytes+" KB= "+YY+"MB and "+ZZ+" KB");
		}
	}

}
