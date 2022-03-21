package Collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("15");
		v.add("25");
		v.add("30");
		v.add("15");
		v.add("56");
		v.add("45");
		v.add("86");
		v.add("75");
		v.add("73");
		v.add("13");
		System.out.println(v);
		System.out.println(v.capacity());
		v.add("89");
		System.out.println(v.capacity());
		v.clear();
		System.out.println(v);
	}
}
