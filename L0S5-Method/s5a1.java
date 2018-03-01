public class s5a1{
	public String str;
	public s5a1(String str)
	{
		
		this.str=str;

	}

	public static void swap(s5a1 str1,s5a1 str2){
		String temp;
		temp=str1.str;
		str1.str=str2.str;
		str2.str=temp;
	}


	public static void main(String[] args) {
	        // write your code here
	        
			s5a1 obj1 = new s5a1("Hello");
			s5a1 obj2 = new s5a1("Java");

	        System.out.println("Before swap str1 and str2 are "+obj1.str+" and "+obj2.str);
	        swap(obj1,obj2);
	        System.out.println("After swap str1 and str2 are "+obj1.str+" and "+obj2.str);

	    }
}
