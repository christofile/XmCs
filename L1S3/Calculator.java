package L1S3;

class Cal{
	int Addition(int a, int b) {
		int c;
		c=a+b;
		return c;
	}
	double Addition(double a, double b) {
		double c;
		c=a+b;
		return c;
	}
	int Substration(int a, int b) {
		int c;
		c=a-b;
		return c;
	}
	double Substration(double a, double b) {
		double c;
		c=a-b;
		return c;
	}
	double Multiplication(double a, double b) {
		double c;
		c=a*b;
		return c;
	}
	double Division(double a, double b) {
		double c;
		c=a/b;
		return c;
	}
	double Inverse(double x) {
		double c;
		c=1/x;
		return c;
	}
	double Negation(double x) {
		double c;
		c=-x;
		return c;
	}
	
}

public class Calculator {
	public static void main(String[] args) {
		Cal obj=new Cal();
		//obj.Addition(11,22);
		System.out.println("a and b is "+obj.Addition(11,22));
		System.out.println("a and b is "+obj.Addition(3.5,6.6));
		System.out.println("a minus b is "+obj.Substration(5,3));
		System.out.println("a minus b is "+obj.Substration(2.5,3));
		System.out.println("a multiplied b is "+obj.Multiplication(2.5,3));
		System.out.println("a div b is "+obj.Division(6,3));
		System.out.println("1/x is "+obj.Inverse(6));
		System.out.println("Negation of x is "+obj.Negation(6));
	}
}
