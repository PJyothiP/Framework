package JavaBasics;

public class PalindromeDemo {

	public static void main(String[] args) {
		int n = 796, rem = 0;
		int temp = n;
		for(;temp>0;) {
			rem = (rem*10) + (temp%10);
			temp = temp/10;
		}
		if(rem == n) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
