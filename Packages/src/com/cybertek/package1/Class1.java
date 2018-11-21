package com.cybertek.package1;
//import com.cybertek.package2.*;//1 way
//import com.cybertek.package2.Class2; //second way
//import com.cybertek.package2.Class3;
public class Class1 {
	
   public static void main(String[] arg) {
		//There are 3 ways to access package from outside the package
	   //1- import package.*;
	   //2- import package.className
	   //3-fully qualified name
	   
	  // Class2 c1= new Class2(); - this for 1,2 way to use
	   
	   com.cybertek.package2.Class2 c1= new com.cybertek.package2.Class2();  //3 way
	   com.cybertek.package2.Class3 c1l= new com.cybertek.package2.Class3();
	}

}
