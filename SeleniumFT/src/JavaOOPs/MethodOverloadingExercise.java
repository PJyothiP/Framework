package JavaOOPs;

public class MethodOverloadingExercise {
	public static final double pi = 3.14;
	public static void main(String[] args) {
		int l = 10,b=5,s=6,r = 10;
		MethodOverloadingExercise moe = new MethodOverloadingExercise();
		moe.area(l, b);
		moe.area(s, s);
		moe.area(r);
	}
	public void area(int l,int b) {
		if(l == b) {
			System.out.println("The area of a square is : "+(l*b));
		}else {
			System.out.println("The area of a rectangle is : "+(l*b));
		}
	}
	public void area(double r) {
		System.out.println("The area of a circle is : "+(pi*r*r));
	}
}
