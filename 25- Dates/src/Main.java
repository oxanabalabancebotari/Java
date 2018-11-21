import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Simple date format is a concrete class for formating and parsing date which inherits
		//java.text.DateFormat class
		//formatting- converting date to string, and parsing means converting string to date
		
	     Date date= new Date();
		System.out.println(date);  //Wed Nov 21 11:21:48 EST 2018 (current date)
		
		
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy"); //M=month
		String strDate= formatter.format(date);
		System.out.println(strDate);  //21/11/2018
		
		formatter= new SimpleDateFormat("MM/dd/yyyy");
		strDate=formatter.format(date);
		System.out.println(strDate);  //11/21/2018
		
		
		formatter= new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate=formatter.format(date);
		System.out.println(strDate);  //21-11-2018 11:25:36
		
		formatter= new SimpleDateFormat("dd MMMM yyyyy");
		strDate=formatter.format(date);
		System.out.println(strDate);    //21 November 02018
		
		formatter= new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate=formatter.format(date);
		System.out.println(strDate);  //21 November 2018 Eastern Standard Time
		
		formatter= new SimpleDateFormat("E,dd MMMM yyyy zzzz HH:mm:ss z");
		strDate=formatter.format(date);
		System.out.println(strDate);   //Wed,21 November 2018 Eastern Standard Time 11:31:15 EST
		
		
		//Convert String into Date
		formatter= new SimpleDateFormat("dd/MM/yyyy");
		try {
			date= formatter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//click throw declaration- will add to main function// same as try and catch
		
		System.out.println(date); //Tue Mar 31 00:00:00 EDT 2015
		

	}

}
