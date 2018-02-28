package L1S3;

class SciCal extends Cal{
	void Cos(double x) {
		double c;
		c=Math.cos(x);
		System.out.println("Cosine of x is "+c);
	}
	void Sin(double x) {
		double c;
		c=Math.sin(x);
		System.out.println("Sine of x is "+c);
	}
	void Tan(double x) {
		double c;
		c=Math.tan(x);
		System.out.println("Tan of x is "+c);
	}
	void Cot(double x) {
		double c;
		c=Math.cos(x)/Math.sin(x);
		System.out.println("Cot of x is "+c);
	}
	void Log2(double x) {
		double c;
		c=Math.log(x)/Math.log(2);
		System.out.println("Log2 of x is "+c);
	}
	void Log10(double x) {
		double c;
		c=Math.log(x)/Math.log(10);
		System.out.println("Log10 of x is "+c);
	}
	void Pow(double x,double y) {
		double c;
		c=Math.pow(x,y);
		System.out.println("x^y is "+c);
	}
	void Square(double x) {
		double c;
		c=Multiplication(x,x);
		System.out.println("Square of x is "+c);
	}
	void YthRoot(double x,double y) {
		double c;
		c=Math.sqrt(x/y);
		System.out.println("Yth Root of x is "+c);
	}
}

public class ScientificCalculator {
	public static void main(String[] args) {
		SciCal obj=new SciCal();
		obj.Cos(32);
		obj.Sin(32);
		obj.Tan(32);
		obj.Cot(32);
		obj.Log2(32);
		obj.Log10(32);
		obj.Pow(3,2);
		obj.Square(32);
		obj.YthRoot(3,2);
		
	}
}
