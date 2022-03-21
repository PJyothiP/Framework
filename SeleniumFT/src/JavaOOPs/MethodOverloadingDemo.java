package JavaOOPs;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		int a = 20, b=10;
		double x = 3.7,y = 9.2;
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		mod.sum(a,b);
		mod.sum(x, y);
		mod.sum();
	}
	public void sum(int a, int b) {
		System.out.println("This is sum of integers method");
	}
	public void sum(double a, double b) {
		System.out.println("This is sum of doubles method");
	}
	public void sum() {
		System.out.println("this is default sum");
	}
}
