package Collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> tm = new TreeMap<String,Integer>(Comparator.reverseOrder());
		tm.put("Kavita",20);
		tm.put("Hussain",15);
		tm.put("Sushma",7);
		tm.put("Supriya",30);
		tm.put("Gangadhar",40);
		tm.put("Haseena",27);
		tm.put("gangadhar", 6);
		System.out.println(tm.entrySet());
		System.out.println(tm.get("Haseena"));
		System.out.println(tm.keySet());
	}

}
