package JavaBasics;

public class ElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5,b=17,c=15;
		
		if(a>=b) {
			System.out.println("a is greater than b");
		}else if(b>=c) {
			System.out.println("b is greater than c");
		}else if(a>=c) {
			System.out.println("a is greater than c");
		}else {
			System.out.println("c is greater");
		}
	}
}
