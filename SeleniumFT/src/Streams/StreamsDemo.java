package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		Stream.of("a1","b2","c3","d111")
		.map(x->x.substring(1))
		.mapToInt(Integer::parseInt)
		.average()
		.ifPresent(System.out::println);
		
		IntStream.of(10,20,30,40)
		.mapToObj(String::valueOf)
		.forEach(System.out::println);
		
		
		Stream.of("a1","b2","c3","d111")
		.map(x->x.substring(0, 1))
		.forEach(System.out::println);
		
		Stream.of(1.0,2.2,3.4,5.6)
		.map(Double::intValue).forEach(System.out::println);
		System.out.println("------------------------");
		
		//loops in streams
		Stream.iterate(1, x->x+2)
		.limit(10).forEach(System.out::println);
		//Stream.generate(null)
	}

}
