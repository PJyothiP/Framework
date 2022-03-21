package JavaOOPs;

public class EncapsulationExerciseImpl {

	public static void main(String[] args) {
		int[] marks = {45,48,46,49,50,45};
		EncapsulationExcercise ee = new EncapsulationExcercise();
		ee.setName("Kavita");
		ee.setRollno(123456);
		ee.setMarks(marks);
		System.out.println(ee.getName()+" whose rollnumber is : "+ee.getRollno()
				+ "got an average of : "+ee.getAvg());
	}
}
