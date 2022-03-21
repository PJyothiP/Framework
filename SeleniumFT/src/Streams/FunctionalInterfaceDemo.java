package Streams;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public void demo(String abc,int i);
	default void dummy() {
		System.out.println("This is the default method");
	}
	public static void staticDemo() {
		System.out.println("This is my static method");
	}
	//public void demo2();
}
