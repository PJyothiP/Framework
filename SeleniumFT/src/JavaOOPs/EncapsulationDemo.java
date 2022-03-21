package JavaOOPs;

public class EncapsulationDemo {
	private int age;
	private String name;
	public int getAge() {
		return ((age+10) * 2);
	}
	public void setAge(int age) { 
		  this.age = age; 
	} 
	public String getName() {
		return "Welcome "+name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
