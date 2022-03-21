package JavaOOPs;
public class BankInterfaceDemo implements RBIInteface,USInteface{
	public static void main(String[] args) {
		BankInterfaceDemo bid = new BankInterfaceDemo();
		bid.debit(200);
		bid.credit(300);
		bid.demo();
		bid.creditInDollars();
		System.out.println("-------------------------");
		RBIInteface rbi = new BankInterfaceDemo();
		rbi.credit(100);
		rbi.debit(200);
		System.out.println("----------------------------");
		System.out.println("The min balace of bank is : "+rbi.min_balance);
		USInteface usi = new BankInterfaceDemo();
		usi.creditInDollars();
		usi.debit();
		//rbi.demo();
	}
	@Override
	public void debit(int amount) {
		int bank_balance = 500;
		bank_balance = bank_balance  - amount;
		System.out.println("This is my new bank balance after debit: "+bank_balance);
	}
	@Override
	public void credit(int amount) {
		int bank_balance = 600;
		bank_balance = bank_balance + amount;
		System.out.println("This is my new bank balance after credit : "+bank_balance);
	}
	public void demo() {
		System.out.println("This is demo method");
	}
	@Override
	public void creditInDollars() {
		System.out.println("This is creditInDollars");
	}
	@Override
	public void debit() {
		System.out.println("This is the debit in US interface");
	}
}
