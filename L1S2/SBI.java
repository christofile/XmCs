package L1S2;

public class SBI extends Bank{
	public SBI(double rate) {
		super(rate);
		// TODO Auto-generated constructor stub
	}

	public double getRate(){
		rate=8.4;
		return rate;
	}
	
	public static void main(String args[]) {
		double realRate;
		Bank obj=new SBI(rate);
		realRate=obj.getRate();
		System.out.println("SBI rate is "+realRate+"%.");
	}
}
