package JavaBasics;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integers
		
		int[] a = new int[5];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 20;
		a[4] = 25;
		
		System.out.println("This is the third element of my array : "+a[2]);
		
		int[] ab = {2,3,6,7,8,9,10};
		
		System.out.println("This is the third element of my array a: "+ab[2]);
		
		System.out.println("-------------------------");
		
		//Strings
		
		String s = "This is my demo class";
		String st[] = s.split("i");
		System.out.println("This is the second element of string array : "+st[2]);
		
		String sa[] = {"This","is","my","demo","class"};
		System.out.println("This is my second element of string array : "+sa[1]);
		System.out.println("--------------------------");
		char[] c = {'h','k','s','s','b'};
		System.out.println("Third element of character array si : "+c[2]);
		
	}

}
