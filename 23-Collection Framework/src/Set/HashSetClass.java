package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		Set<Integer>value= new HashSet<Integer>();
		
		value.add(15);
		value.add(19);
		value.add(6);
		
		value.add(6);
		value.add(8);
		value.add(88);
		
		for(int i: value) {
			System.out.println(i);//duplicate is not allowed, come in any order
		}
		

	}

}
