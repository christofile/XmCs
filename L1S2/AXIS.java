package L1S2;

public class AXIS extends Bank{
	public AXIS(double rate) {
		super(rate);
		// TODO Auto-generated constructor stub
	}

	public double getRate(){
		rate=9.7;
		return rate;
	}
	
	public static void main(String args[]) {
		double realRate;
		Bank obj=new AXIS(rate);
		realRate=obj.getRate();
		System.out.println("AXIS rate is "+realRate+"%.");
	}
}
