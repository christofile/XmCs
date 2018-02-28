package L1S2;

public class Bank {
	protected static double rate;
	
	public Bank(double rate) {
		Bank.rate=rate;
	}
	
	public double getRate(){
		rate=5.2;
		return rate;
	}
}
