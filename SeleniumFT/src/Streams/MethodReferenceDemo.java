package Streams;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		MethodReferenceDemo mrd = new MethodReferenceDemo("Hussain",10);
		FunctionalInterfaceDemo fid = MethodReferenceDemo::methodRef;
		FunctionalInterfaceDemo fid1 = mrd::nonstaticmethodRef;
		FunctionalInterfaceDemo fid2 = MethodReferenceDemo::new;
		fid.demo("Kavita", 10);
		fid1.demo("Supriya", 20);
		fid2.demo("Haseena", 40);
		MethodReferenceDemo.methodRef(null, 0);
	}
	public static void methodRef(String abc,int a) {
		System.out.println("This is my method Reference");
	}
	public void nonstaticmethodRef(String x,int b) {
		System.out.println("This is my non static method referece");
	}
	public MethodReferenceDemo(String a,int c) {
		System.out.println("This is constructor method reference");
	}
}
