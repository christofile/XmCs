package L1S5;


class Parent {
  	void msg(){System.out.println("Parent!");}  
}  
  
class TestExceptionChild1 extends Parent{  
	void msg() throws ArithmeticException{  
    System.out.println("TestExceptionChild with unchecked exception.");  
	}  
}

/*class TestExceptionChild2 extends Parent{  
	void msg() throws IOException{  
    System.out.println("TestExceptionChild with checked exception.");  
	}  
}*/

public class excepOverridingRule1{
	public static void main(String args[]){  
		Parent p1=new TestExceptionChild1();  
		p1.msg();
		//Parent p2=new TestExceptionChild2();  
		//p2.msg();
	}  
}
