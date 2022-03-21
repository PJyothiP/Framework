package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(15);
		System.out.println(ll);
		ll.remove(0);
//		System.out.println("------------removeif--------------");
//		ll.removeIf(a->a>20);
//		System.out.println(ll);
//		System.out.println("------------iterator--------------");
//		Iterator<Integer> it = ll.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println("----------loop------------------");
//		for(int i = 0;i<ll.size();i++) {
//			System.out.println(ll.get(i));
//		}
//		System.out.println("-----------listiterator from last to first----------------");
//		ListIterator<Integer> lit = ll.listIterator(ll.size());
//		while(lit.hasPrevious()) {
//			System.out.println(lit.previous());
//		}
//		System.out.println("------------listIteror------------------");
//		ListIterator<Integer> lit2 = ll.listIterator();
//		while(lit.hasNext()) {
//			System.out.println(lit.next());
//		}
	}

}
