package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	private static List<String> li = null;
	public static void main(String[] args) {
		//Arrays
		String[] s= {"Gangadhar","Sushma","Supriya","Kavita","def"};
		//1.
		List<String> li = Arrays.stream(s).filter(x->x.length() > 6).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		Stream.of(s).filter(x->x.startsWith("S")).forEach(System.out::println);
		System.out.println(li);
		System.out.println("---------------------------------");
		int[] i = {10,2,5,8,6,15,20};
		//2.
		IntStream.of(i).filter(x->x<10).forEach(System.out::println);
		System.out.println("------------------");
		Arrays.stream(i).filter(x->x>=10).forEach(System.out::println);
		System.out.println("--------------------------------");
		//Collections
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(17);
		li1.add(40);
		li1.add(20);
		li1.add(35);		
		li1.stream().filter(x->x>15).sorted().forEach(System.out::println);
		Set<String> s1 = new HashSet<String>();
		s1.add("Kavita");
		s1.add("Supriya");
		s1.stream().filter(x->x.length()>6).map(x->x.concat(" Success ")).forEach(System.out::println);
		System.out.println("--------------------------------");
		
		//Supplier
		
		String[] str = {"Gangadhar","Sushma","Supriya","Kavita","def"};
		Supplier<Stream<String>> st = () -> Arrays.stream(str);
		//Stream<String> st = Arrays.stream(str);
		st.get().filter(x->x.length()>6).forEach(System.out::println);
		st.get().filter(x->x.contains("a")).forEach(System.out::println);
		
	}
}
