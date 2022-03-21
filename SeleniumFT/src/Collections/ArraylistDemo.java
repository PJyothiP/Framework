package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Kavita");
		li.add("Hussain");
		li.add("Sushma");
		li.add("charitha");
		System.out.println(li);
		System.out.println("---------------Union--------------------");
		List<String> li2 = new ArrayList<String>();
		li2.add("Haseena");
		li2.add("Supriya");
		li.addAll(li2);
		System.out.println(li);
		System.out.println("------------------remove one-----------------------------");
		li.remove("Kavita");//li.remove(0);
		System.out.println(li);
		System.out.println("-------------remove all-----------------------");
		//li.removeAll(li2);
		System.out.println(li);
		System.out.println("---------------remove if---------------------------");
		li.removeIf(x->x.startsWith("H"));
		System.out.println(li);
		System.out.println("The size of list is "+li.size());
		System.out.println("---------------clear-------------------");
		//li.clear();
		System.out.println("----------------retainAll----------------");
		li.retainAll(li2);
		System.out.println(li);
		System.out.println("-----------equals----------------------------");
		if(li.equals(li2)) {
			System.out.println("The two lists are equal");
		}else {
			System.out.println("The two lists are not equal");
		}
		System.out.println("------------contains-------------------");
		if(li.contains("Kavita")) {
			System.out.println("My list contains kavita");
		}else {
			System.out.println("My list does not contain kavita");
		}
		System.out.println("------------contains all-------------------");
		if(li.containsAll(li2)) {
			System.out.println("list 1 contains list2");
		}else {
			System.out.println("list1 does not contain list 2");
		}
		System.out.println("------------iterator------------------");
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------to Array-----------------");
		Object[] obj = li.toArray();
		System.out.println("the size of object array is : "+obj.length);
	}

}
