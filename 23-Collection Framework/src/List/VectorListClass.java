package List;

import java.util.Vector;

public class VectorListClass {

	public static void main(String[] args) {
		
		//vector capasite is 10, and the capasity is 100%
		//vector is slow- not good to use
		Vector<Integer> v= new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(1);
		v.add(1);
		v.add(1);
		
		v.add(1);
		System.out.println(v.capacity());// 10 vector capacity is there built in

	}

}
