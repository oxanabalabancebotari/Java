
public class Assignm8 {

	public static void main(String[] args) {
		getDurationString(80,10);
		getDurationString(70);

	}
	public static void getDurationString(long minutes, long seconds) {
		if(minutes>=0 && seconds>=0 && seconds<=59) {
			long totalHour= (minutes/60);
			long totalMin=(minutes%60);
			System.out.println(totalHour+ " hours " +totalMin+" minutes "+seconds+" seconds");
		}else {
			System.out.println("Invalid value");
		}
	
	}
    public static void getDurationString(long seconds) {
    	if(seconds>=0) {
    		long totalMinute=(seconds/60);
    		long totalSecond=(seconds%60);
    		System.out.println(totalMinute+" minutes "+ totalSecond+" seconds");
    	}else {
    		System.out.println("Invalid value");
    	}
		
	}


}
