package JavaOOPs;

public class ConstructorDemo {

	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo(10);
		cd.demo();
	}
	public ConstructorDemo(int age) {
		System.out.println("This is my constructor "+age);
	}
	public void demo() {
		System.out.println("This is demo method");
	}
}
