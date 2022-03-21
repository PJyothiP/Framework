package Collections;

public class HashcodeDemo{

	public static void main(String[] args) {
		HashcodeDemo h = new HashcodeDemo();
		HashcodeDemo h2 = new HashcodeDemo();
		HashcodeDemo h3 = h2;
		System.out.println("hashcode of h: "+h.hashCode()+
				" hashcode of h2 "+h2.hashCode()
				+" hashcode of h3 "+h3.hashCode());
		if(h == h2) {
			System.out.println("both the objects are equal");
		}else {
			System.out.println("Both the objects are not equal");
		}
		
		
		System.out.println("-------------------------------------");
		String s1 = "Aa";
		String s2 ="BB";
		System.out.println("Hashcode of s1 = "+s1.hashCode()
		+" and hashcode of s2 = "+s2.hashCode());
	}
}
