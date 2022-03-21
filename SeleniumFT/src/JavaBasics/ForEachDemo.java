package JavaBasics;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integers
		int[] abc = {10,20,4,8,2,12}; 
		for (int i : abc) {
			System.out.println("i value is "+i);
		}
		
		//Strings
		String[] xyz = {"Kavita","Haseena","Supriya","Sushma"};
		for (String i : xyz) {
			System.out.println(i);
		}
	}
}
