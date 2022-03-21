package Collections;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("This ");
		s.push("is ");
		s.push("demo");
		s.push("Class");
		System.out.println(s);
		System.out.println("--------------pop-----------------------");
		System.out.println(s.pop());
		System.out.println(s);
		int ind = s.search("This ");
		System.out.println("The index of search element is : "+ind);
		
		System.out.println("This is the next element to be removed : "+s.peek());
		System.out.println(s);
		s.clear();
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("stack contains elements");
		}
	}

}
