package Collections;

public class HashdemoImpl {
	public static void main(String[] args) {
		Hashdemo hd1 = new Hashdemo(1234,"Kavita");
		Hashdemo hd2 = new Hashdemo(1234,"Gangadhar");
		HashdemoImpl hd3;
		System.out.println("Hashcode of hd1 is :"+hd1.hashCode());
		System.out.println("Hashcode of hd2 is : "+hd2.hashCode());
		if(hd1.equals(hd2)) {
			System.out.println("two objects are equal");
		}else {
			System.out.println("Two objects are not equal");
		}
	}

}
