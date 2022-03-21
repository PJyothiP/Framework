package Collections;

public class MutabilityDemo {

	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println("This is value of a : "+a);
		String str = "Kavita";
		String str2 = str.concat("abc");
		System.out.println("This is str value : "+str.hashCode());
		System.out.println("this is str2 value : "+str2);
		String s5 = new String("Sushma").intern();
		s5.concat(str2);
		System.out.println("S5 string is "+s5);
	}

}
