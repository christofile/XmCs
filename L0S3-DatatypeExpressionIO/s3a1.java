import java.util.Scanner;  

public class s3a1 {

	float result;
	public void add(float num1,float num2){
		result=num1+num2;
		System.out.println("Addition result is "+result);
	}

	public void division(float num1,float num2){
		result=num1/num2;
		System.out.println("Division result is "+result);
	}

	public void multiplication(float num1,float num2){
		result=num1*num2;
		System.out.println("Multiplication result is "+result);
	}

	public static void main(String[] args) {
	        // write your code here
	        System.out.println("Please select your arithmetic operations:");
	        System.out.println("1:Addition");
	        System.out.println("2:Division");
	        System.out.println("3.Multiplication");
	        Scanner sc=new Scanner(System.in);
	        int selection=sc.nextInt();
	        System.out.println("Please enter two numbers:");
	        float num1=sc.nextFloat();
	        float num2=sc.nextFloat();
	       	s3a1 obj=new s3a1();
	        switch(selection)
	        {
	        	case 1: 
	        		System.out.println("Selection:Addition");	      			
	      			obj.add(num1,num2);
	      			break;
	     		case 2: 
	        		System.out.println("Selection:Division");
	     			obj.division(num1,num2);
	      			break;
	      		case 3: 
	        		System.out.println("Selection:Multiplication");
	      			obj.multiplication(num1,num2);
	      			break;
	        	default:
	        		System.out.println("You've made wrong desision.");
	        		break;

	        }
	        

	    }
}