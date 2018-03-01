package L1S2;

public class ICIC extends Bank{
	public ICIC(double rate) {
		super(rate);
		// TODO Auto-generated constructor stub
	}

	public double getRate(){
		rate=7.3;
		return rate;
	}
	
	public static void main(String args[]) {
		double realRate;
		Bank obj=new ICIC(rate);
		realRate=obj.getRate();
		System.out.println("ICIC rate is "+realRate+"%.");
	}
}
