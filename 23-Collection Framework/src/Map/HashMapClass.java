package Map;

import java.util.*;


public class HashMapClass {

	public static void main(String[] args) {
		//we will create a collection with keys and value
		
		
		//Map map= new HashMap();//is creating an object with no specific data
		
		Map<String,String> map= new HashMap<>(); //here we assign the string value
		
		map.put("myName","Mike");
		map.put("myJob","Developer");
		map.put("myAge","25");
		map.put("x","y");
		
		System.out.println(map);// print in random order
		
		System.out.println(map.get("myName"));//to get a specific one
		
		Set<String> keys= map.keySet();//collection of keys
		
		for(String key:keys) {
			System.out.println(key+ " "+map.get(key));// you can access the keys
		}

	}

}
