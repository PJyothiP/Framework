package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>(new IntegerComparator());
		pq.add(5);
		pq.add(82);
		pq.add(63);
		pq.add(24);
		pq.add(42);
		pq.add(52);
		pq.add(25);
		pq.add(10);
		pq.add(5);
		//System.out.println(pq);
		//System.out.println("The next element to be processed : "+pq.peek());
		//System.out.println("The next element to be processed : "+pq.element());
		//System.out.println("The element removed is :  "+pq.poll());
		//System.out.println(pq);
		//System.out.println("The element removed is :  "+pq.remove());
		System.out.println(pq);
		System.out.println("------------------------------");
		while(pq.peek() != null) {
			System.out.print(pq.poll()+" , ");
		}
	}
}
class IntegerComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer a, Integer b) {
		if(a == b) {
			return 0;// no swap will be performed
		}else if (a > b) {
			return 1; //swap will be performed
		}else {
			return -1; // no swap will be performed
		}
	}
}