package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("Sushma", 1234);
		lhm.put("Kavita", 2345);
		lhm.put("Haseena", 4567);
		lhm.put("Gangadhar", 5678);
		lhm.put("Supriya", 7894);
		lhm.put(null, 9876);
		lhm.put("Haseena", 6543);
		lhm.put("Hussain", 7852);
		System.out.println(lhm.entrySet());
		System.out.println(lhm.putIfAbsent("Kavita1", 123456));
		System.out.println(lhm.entrySet());
	}

}
