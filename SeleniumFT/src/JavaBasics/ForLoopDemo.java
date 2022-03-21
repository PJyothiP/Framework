package JavaBasics;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<=10;i++) {
			System.out.println("this is i : "+i);
		}
		System.out.println("-------------------------------");
		int n = 10;
		
		for(int j = n-1;j>=1;j--) {
			n = n*j;
		}
		System.out.println("the factorial of n is : "+n);
		System.out.println("---------------------------");
		
		int m  = 9,k = m-1;
		while(k>=1) {
			m = m*k;
			k--;
		}
		System.out.println("The factorial of m is :"+m);
		
		System.out.println("-------------------");
		
		int abc = 0;
		do {
			System.out.println("This is abc value : "+abc);
			abc++;
		}while(abc>0);
	}

}
