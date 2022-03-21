package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamsDemo {
	public static void main(String[] args) {
		//Sequential Stream
		Stream.iterate(1, x->x+1)
		.limit(10)
		.forEach(System.out::println);
		System.out.println("-----------------------");
		Stream.iterate(1, x->x+1)
		.limit(10)
		.parallel().sorted().forEach(System.out::println);
		
		long t1,t2;
		
		t1 = System.currentTimeMillis()/1000;
		
		long count = Stream.iterate(1, x->x+1)
		.limit(1000000)
		.parallel()
		.filter(ParallelStreamsDemo::isPrime)
		.peek(System.out::println)
		.count();
		
		t2 = System.currentTimeMillis()/1000;
		
		System.out.println("The count of prime numbers in the range is "+count
				+"time taken for the process is "+(t2-t1));
		
		//The count of prime numbers in the range is 78499time taken for the process is 167 --seq
		//The count of prime numbers in the range is 78499time taken for the process is 119 --parallel
	}
	private static boolean isPrime(int n) {
		if(n<=1) {
			return true;
		}
		return !IntStream.rangeClosed(2, n/2).anyMatch(x->n%x == 0);
	}
}
