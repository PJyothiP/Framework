package JavaOOPs;

public class ObjectsDemo {

	public static void main(String[] args) {
		System.out.println("This is main method");
		ObjectsDemo od = new ObjectsDemo();
		int result = od.demo();
		System.out.println("After demo method result is "+result);
		ObjectsDemo.dummy();
	}
	int demo() {
		int a = 5,b =2;
		System.out.println("This is my demo method");
		return (a+b);
	}
	private static void dummy() {
		System.out.println("This is a static method");
	}
}
