package Streams;

public class FIImpl{

	public static void main(String[] args) {
		FunctionalInterfaceDemo fid = (x,y) -> {
			System.out.println(x +" and the integer value is : "+y);};
		FunctionalInterfaceDemo fid1 = (a,b) -> {
			System.out.println(a);System.out.println(++b);};
		fid.demo("Kavita",20);
		fid1.demo("Hussain",10);
		
	}
}
