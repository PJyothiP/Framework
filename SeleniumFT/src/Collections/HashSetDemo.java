package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Abc");
		hs.add("bca");
		hs.add("bca");
		System.out.println(hs);
	}
}
