package JavaBasics;

public class VaraibleTypes {
	private static double pi123 = 3.14;//class variable
	private double pi234 = 4.2;//instance variable
	public static void main(String[] args) {
		final int d = 10;
		VaraibleTypes vt1 = new VaraibleTypes();
		VaraibleTypes vt2 = new VaraibleTypes();
		VaraibleTypes vt3 = new VaraibleTypes();
		pi123 = 7.8;
		//this is a new change   
		System.out.println("This is static pi value in static method : "+VaraibleTypes.pi123);
		System.out.println("This is nonstatic pi value of vt1 object in static method :"+vt1.pi234);
		vt1.pi234 = 5.4;
		System.out.println("This is nonstatic pi value of vt1 object in static method :"+vt1.pi234);
		System.out.println("This is nonstatic pi value of vt1 object in static method :"+vt2.pi234);
		vt1.demo();
	}
	public void demo() {
		System.out.println("This is static pi value in nonstatic method : "+VaraibleTypes.pi123);
		System.out.println("This is nonstatic pi value of vt1 object in static method :"+pi234);
	}
}
