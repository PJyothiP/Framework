package Streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	public static void main(String[] args) {
		String[][] s = {{"This","is"},
						{"my","first"},
						{"demo","class"}};
		//display as it is
		List<String[]> li = Arrays.asList(s);
		for (String[] strings : li) {
			for(int i = 0;i<strings.length;i++) {
				System.out.println(strings[i]);
			}
		}
		System.out.println("------------------------------------");
		//Flat map
		Arrays.stream(s).flatMap(x->Arrays.stream(x)).filter(x->x.contains("i"))
		.sorted().map(x->x.concat(" success ")).forEach(System.out::println);
	}

}
