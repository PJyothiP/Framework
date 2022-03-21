package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Sushma", 1234);
		hm.put("Kavita", 2345);
		hm.put("Haseena", 4567);
		hm.put("Gangadhar", 5678);
		hm.put("Supriya", 7894);
		hm.put(null, 9876);
		hm.put("Haseena", 6543);
		hm.put("Hussain", 7852);
		System.out.println(hm.get("Supriya"));
		System.out.println(hm.entrySet());
		for (Entry<String,Integer> e : hm.entrySet()) {
			System.out.println("This is my key : "+e.getKey()+" and the value is : "+e.getValue());
		}
		int[] a = {10,20,30,40};
		for (int i : a) {
			System.out.println(i);
		}
	}
}
