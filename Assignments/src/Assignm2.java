
public class Assignm2 {

	public static void main(String[] args) {
	
		isCatPlaying(true,10);
		isCatPlaying(false,36);
		isCatPlaying(false,35);
		

	}
	public static void isCatPlaying(boolean summer, int temperature) {
		if(summer==false && temperature>=25 && temperature<=35) {
			System.out.println(true);
			
		}else if(summer== true && temperature>=25 && temperature<=45) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
