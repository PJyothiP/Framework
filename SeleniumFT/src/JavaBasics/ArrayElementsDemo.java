package JavaBasics;

public class ArrayElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,3,5,17,19};
		// for loop
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("---------------------------------");
		//while loop
		int k = 0;
		while(k<a.length) {
			System.out.println(a[k++]);
		}
		System.out.println("--------------------------------------");
		//do while
		int l = 0;
		System.out.println("The length of the array is : "+a.length);
		do {
			System.out.println("The array element is "+ a[l]+" and l value is : "+l);
			l++;
		}while(l<a.length);
	}

}
