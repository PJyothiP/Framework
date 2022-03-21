package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		ht.put(2, 45678);
		ht.put(4,8975);
		//ht.put(null, 7526);
		ht.put(2, 5864);
		ht.put(5, 1578);
		ht.put(7, 5971);
		System.out.println(ht.entrySet());
		System.out.println(ht.replace(2, 5232));
		System.out.println(ht.entrySet());
		
	}

}
