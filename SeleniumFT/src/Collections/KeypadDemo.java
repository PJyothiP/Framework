package Collections;

import java.util.HashMap;
import java.util.Map;

public class KeypadDemo {
		
	public static Map<Character,Integer> hm = new HashMap<Character,Integer>();
	public static void main(String[] args) {
		KeypadDemo.insertintoMap();
		String s = "haseena";
		boolean flag = true;
		for(int i =0;i<s.length();i++){
			if(s.charAt(i) >'A' && s.charAt(i) < 'Z') {
				System.out.println("The string contains capital letters cannot calculate count");
				flag = false;
				break;
			}else {
				flag = true;
			}
		}
		if(flag) {
			for(int i =0;i<s.length();i++) {
				for(int j = i+1;j<=s.length();j++) {
					String sub = s.substring(i,j);
					System.out.println("The substring is : "+sub+" and its count is : "
					+KeypadDemo.calculateSum(sub));
				}
			}
		}
	}
	public static void insertintoMap() {
		int temp = 1, count = 1;
		for(char ch = 'a';ch <= 'z';ch++) {
			if(temp > 3) {
				count++;
				temp = 1;
			}
			hm.put(ch, count);
			temp++;
		}
		System.out.println(hm.entrySet());
	}
	public static int calculateSum(String s) {
		int sum = 0;
		for(int i = 0; i<s.length();i++) {
			sum += hm.get(s.charAt(i));
		}
		return sum;
	}
}
