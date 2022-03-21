package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int[] a = {2,2,5,4,1,6,8,3,2,5,1,2,4,5,1};
		Map <Integer,Integer> hm = new HashMap<Integer, Integer>();
		for (int i : a) {
			if(hm.get(i) == null) {
				hm.put(i, 1);
			}else {
				hm.put(i, hm.get(i)+1);
			}
		}
		for (Entry<Integer,Integer> i : hm.entrySet()) {
			System.out.println(i.getKey()+" has repeated : "+i.getValue() + " times");
		}
	}

}
