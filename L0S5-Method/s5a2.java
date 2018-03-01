public class s5a2{
	
	public int area(int length, int width)
	{
		return (length*width);
	}

	public double area(double length, double width)
	{
		return (length*width);
	}

	public static void main(String[] args) {
	        // write your code here
	        

	        s5a2 obj = new s5a2();
	        System.out.println(obj.area(5,3));
	        System.out.println(obj.area(5.0,3.0));

	    }
}