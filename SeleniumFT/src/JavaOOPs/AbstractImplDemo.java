package JavaOOPs;

public class AbstractImplDemo extends AbstractDemo{

	public static void main(String[] args) {
		
		AbstractDemo ad = new AbstractImplDemo();
		ad.demo();
		ad.dummy();
		ad.demo123();
		AbstractImplDemo aid = new AbstractImplDemo();
		aid.dummy123();
		aid.demo123();
		
	}

	@Override
	protected void demo() {
		System.out.println("This is my demo method in child class");
	}

	@Override
	public void dummy() {
		System.out.println("This is my dummy method in child class");
	}
	
	public void dummy123() {
		System.out.println("This is my dummy123 method");
	}
	@Override
	public void demo123() {
		System.out.println("This is demo123 in child class");
	}
}
