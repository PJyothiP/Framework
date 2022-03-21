package JavaOOPs;

public class ArithmeticOperationsObjects {

	public static void main(String[] args) {
		int x = 20,y = 10;
		int res = 0;
		ArithmeticOperationsObjects aoo = new ArithmeticOperationsObjects();
		res = aoo.addition(x, y);
		res = aoo.subtraction(x, y);
		res = aoo.addition(x, y);
		res = ArithmeticOperationsObjects.divistion(x, y);
	}
	private int addition(int a,int b) {
		System.out.println("This is the result of addition : "+(a+b));
		return (a+b);
	}
	private int subtraction(int a,int b) {
		System.out.println("This is the result of subtraction : "+(a-b));
		return (a-b);
	}
	private int multiply(int a, int b) {
		System.out.println("This is the result of multiplication : "+(a*b));
		return (a*b);
	}
	private static int divistion(int a,int b) {
		System.out.println("This is the result of division "+(a/b));
		return (a/b);
	}
	private int remainder(int a,int b) {
		return (a%b);
	}
}
