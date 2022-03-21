package JavaOOPs;

public class CircleDemo {
	
	public static void main(String[] args) {
		int r = 10;
		final double  res = 3.14;
		CircleDemo cd = new CircleDemo();
		System.out.println("This is the area of the circle : "+cd.area(r, res));
		System.out.println("This is the circumference of the circle : "+cd.circumference(r, res));
		System.out.println("This is the diameter of the circle : "+cd.diameter(r));
	}
	private double area(int r, double res) {
		return res*r*r;
	}
	private double circumference(int r, double res) {
		return 2*res*r;
	}
	private int diameter(int r) {
		return 2*r;
	}
}