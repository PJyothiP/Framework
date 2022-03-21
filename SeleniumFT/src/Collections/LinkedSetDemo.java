package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		Set<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(59);
		ls.add(71);
		ls.add(80);
		ls.add(25);
		ls.add(30);
		System.out.println(ls);
	}

}
