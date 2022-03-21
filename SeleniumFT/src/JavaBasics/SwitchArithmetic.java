package JavaBasics;

public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op = args[0];
		int a = 10,b=2;
		int result = 0;
		System.out.println("args[1] is "+args[1]);
		switch(op) {
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;
		case "/":
			result = a/b;
			break;
		case "%":
			result = a%b;
			break;
			default : 
				System.out.println("Invalid operand");
		}
		System.out.println("The result is : "+result);
	}

}
