package L1S5;

import java.util.Scanner;

class TestException extends Exception{  
	 TestException(String s){  
	  super(s);  
	 }  
	}  

public class excepCustom {
	 static void validate(int num)throws TestException{  
	     if(num!=18)  
	      throw new TestException("You're wrong!");  
	     else  
	      System.out.println("You're corret!");  
	   }  
	
	 public static void main(String args[]){  
		 int num; 
		 System.out.println("Please enter a number:"); 
		 Scanner sc = new Scanner(System.in);
		 num=sc.nextInt();
		 try{  
		  validate(num);  
		      }catch(Exception m){System.out.println("Exception occured: "+m);}  
		  sc.close();
	}  
	
}
