import java.util.Scanner;
public class s3a3{
	public static void main(String[] args) {
	        // write your code here
	        
	        System.out.println("Please enter two strings:");
	        Scanner sc=new Scanner(System.in);
	        String str1=sc.next();
	        String str2=sc.next();
	        System.out.println("The comparision of str1 and str2 is "+str1.compareTo(str2));
	        System.out.println("The length of str1 is "+str1.length());
	        System.out.println("The length of str2 is "+str2.length());
	        System.out.println("The UpperCase of str1 is "+str1.toUpperCase());
	        System.out.println("The UpperCase of str2 is "+str2.toUpperCase());
	        System.out.println("The 3rd Substring of str1 is "+str1.substring(3));
	        System.out.println("The 3rd Substring of str2 is "+str2.substring(3));
	    }
}