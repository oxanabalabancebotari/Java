
public class Main {

	public static void main(String[] args) {
		//chartAt(index)-returns char value for the particular index
		
		String str= "JavaScript";
		System.out.println(str.charAt(3));
		
		//length()- return string length
		System.out.println(str.length());
		
		//substring(int beginIndex)- returns substring for given begining index
		System.out.println(str.substring(5));
		
		//substring(int beginIndex, int endIndex)- return substring for given begin index and end index
		System.out.println(str.substring(2, 6));
		
		//contains()-return true or false after metching the sequence of char value
		System.out.println(str.contains("va"));
		
		//equals(object another)- chechs the equality of string with the given object
		System.out.println(str.equals("JavaScript"));
		
		//isEmpty()-check is the string is empty, true false
		System.out.println(str.isEmpty());
		 
		//concat()- concatinate the specific string
		System.out.println(str.concat("batch9"));
		
		//replace(char old, char new)- replace all occurences of the specified char value
		System.out.println(str.replace("Script", ""));
		
		//equalsIgnoreCase(string another)- compares another string. It does not check case.
		System.out.println(str.equalsIgnoreCase("javaScript"));
		
		//split(String delimter)- returns a split matching delimeter
		String str2= "JavaScript is the best batch ever";
		String[] myArray= str2.split(" ");
		for(String word:myArray) {
			System.out.println(word);
		}
		
		
		//indexOf()- returns the specified chat vlue index, oposit of charAt
		System.out.println(str.indexOf("v"));
		
		
		// indexOf(String substring, int fromIndex)- return the specified substring index with 
		//the given index
		System.out.println(str.indexOf("a", 1));
		
		
		//toLowerCase()- returns a string to lowercase
		System.out.println(str.toLowerCase());
		
		//toUpperCase()- returns a string to Uppercase
			
	    System.out.println(str.toUpperCase());
		
		// trim()- removes begininng and ending
		System.out.println(str.trim());
	}

}
