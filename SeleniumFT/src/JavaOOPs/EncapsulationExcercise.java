package JavaOOPs;

public class EncapsulationExcercise {
	private String name;
	private int rollno;
	private int[] marks = new int[6];
	private double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public double getAvg() {
		int sum = 0;
		for(int i = 0; i< marks.length;i++) {
			sum += marks[i];
		}
		return sum/marks.length;
	}
	
}
