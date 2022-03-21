package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredefinedFIDemo {

	public static void main(String[] args) {
		Function<String, String> f = (x) -> x.concat(" success ");
		String len = f.apply("Haseena");
		System.out.println(len);
		Function<Integer,Integer> f1 = x-> x*x;
		System.out.println(f1.apply(5));
		System.out.println("-------------------------------");
		BinaryOperator<Integer> bf = (a,b) -> a+b;
		System.out.println(bf.apply(10, 20));
		BiFunction<String, String, String> bf1 = (x,y) -> x.replace("vi", y);
		System.out.println(bf1.apply("Kavita", "demo"));
		System.out.println(bf1.andThen(f).apply("Kavita", "ABC"));
		System.out.println("-----------------------------------");
		UnaryOperator<String> uf = (x) -> x.toUpperCase();
		System.out.println(uf.apply("Hussain"));
		UnaryOperator<Integer> uf1 = x->x+100;
		System.out.println(uf1.apply(20));
		System.out.println("-----------------------------------");
		Predicate<Integer> pf = x->x>20;
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(35);
		li.add(25);
		System.out.println(li.removeIf(pf.negate()));
		System.out.println(li);
		System.out.println("-----------------------------");
		Consumer<Integer> cf = (x)-> System.out.println(x);
		cf.accept(20);
		li.forEach(cf);
		li.forEach(System.out::println);
		System.out.println("--------------------------");
		Supplier<String> sf = ()->"Haseena";
		System.out.println(sf.get().length());
		Supplier<Long> sf1 = ()->System.currentTimeMillis();
		System.out.println(sf1.get().toString());
	}

}
