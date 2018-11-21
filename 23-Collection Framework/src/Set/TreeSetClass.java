package Set;

import java.util.*;


public class TreeSetClass {

	public static void main(String[] args) {
		Set<Integer>value= new TreeSet<Integer>();
		
		value.add(15);
		value.add(19);
		value.add(6);
		
		value.add(6);
		value.add(8);
		value.add(88);
		
		for(int i: value) {
			System.out.println(i);//duplication not allowed, print in order ascending order
		}
		

	}

}
