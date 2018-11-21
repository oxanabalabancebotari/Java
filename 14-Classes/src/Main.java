
public class Main {
	public static void main(String[] args) {
		Dog dog1= new Dog();
		dog1.name="Bubbly";
		dog1.age=5;
		dog1.breed="Poodle";
		dog1.color="White";
		System.out.println(dog1.name+ ": "+dog1.age+" : "+dog1.breed+" : "+dog1.color);
		dog1.bark();
		dog1.eat();
		dog1.wagTail();
		
		System.out.println("__________________");
	
		Dog2 dog= new Dog2();
//		dog.name="Jack";
//		dog.age=10;
//		dog.breed="Lab";
//		dog.color="White";
		System.out.println(dog.name+ ": "+dog.age+" : "+dog.breed+" : "+dog.color);
//		dog.bark();
//		dog.eat();
//		dog.wagTail();
		
		Dog2 dog2= new Dog2();
		System.out.println(dog2.name+ ": "+dog2.age+" : "+dog2.breed+" : "+dog2.color);
		
		Dog2 dog3=new Dog2("Rusty",20,"Bulldog","Gray");
		System.out.println(dog3.name+ ": "+dog3.age+" : "+dog3.breed+" : "+dog3.color);
	
//		Dog dog3= new Dog();
//		dog3.name="Fluffy";
//		dog3.age=15;
//		dog3.breed="Poodle";
//		dog3.color="Black";
//		System.out.println(dog3.name+ ": "+dog3.age+" : "+dog3.breed+" : "+dog3.color);
//		dog3.bark();
//		dog3.eat();
//		dog3.wagTail();
	}
	
}
