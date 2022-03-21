package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<Integer>(Comparator.reverseOrder());
		ts.add(59);
		ts.add(14);
		ts.add(80);
		ts.add(25);
		ts.add(30);
		System.out.println(ts);
	}

}
