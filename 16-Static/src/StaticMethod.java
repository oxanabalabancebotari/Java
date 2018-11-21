
public class StaticMethod {

	public static void main(String[] args) {
		Abc x=new Abc();
		Abc.show();  //Static method belong to class
		Abc.show4();
		x.show2();  //instanse object belong to object
		x.show3();

	}

}

class Abc{
	public static void show() {
		System.out.println("Hi");
		//show2();   // will give error because is not static
		// static method cannot call the instance method
		show4();   //work because static can call static 
	}
	public  void show2() {
		System.out.println("Hi 2");
		show();       // will work call instance from static
	}
	public  void show3() {
		System.out.println("Hi 3"); 
	}
	public static void show4() {
		System.out.println("Hi 4");
	}
}
