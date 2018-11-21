package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		Queue <Integer> q= new PriorityQueue<Integer>();
		//add elements
		for(int i=0; i<5; i++) {
			q.add(i);
			
		}
         System.out.println(q);
         
         int removedel=q.remove();
         System.out.println(removedel);//first will be removed
         
         System.out.println(q);//first is removed and not presorve
         
         System.out.println(q.peek());//first one
         
         System.out.println(q.size());
         
	}

}
