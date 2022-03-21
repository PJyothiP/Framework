package JavaBasics;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "xyz";
		int value=0;
		switch(month) {
		case "Jan":
			value = 01;
			break;
		case "Feb":
			value = 02;
			break;
		case "Mar":
			value = 03;
			break;
		case "Apr":
			value = 04;
			break;
		default:
				System.out.println("Invalid month");
		}
		System.out.println("The month value is : "+value);
	}

}
