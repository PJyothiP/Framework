package JavaBasics;

public class VariableDemo {
	
	//Main method is for Printing Hello World
	
	public static void main(String[] args) {
		// Integers
		int a = 5, b = 10;
		int result = a+b;
		System.out.println("The sum is : "+result + " Addition");
		System.out.println("---------------------------");
		
		//float
		
		double d = 10.5;
		double res = a+d;
		System.out.println("This is the output of float and int "+res);
		
		System.out.println("---------------------------------");
		
		//char
		
		char abc = 128; // char abc = 'n'
		System.out.println("This is the character value : "+abc);
		
		System.out.println("----------------------------------");
		
		//Strings
		
		String s = "    This is my demo clAAAAss     ";
		String st = "demo";
		String xy = "basic";
		System.out.println(s.replace(st, "123"));
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.toLowerCase());
		System.out.println("------------------------------");
		
		//boolean
		boolean flag = s.contains(st);
		System.out.println(flag);
		
	}
}
