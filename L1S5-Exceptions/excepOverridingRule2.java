package L1S5;

import java.io.IOException;

class Parent2{  
	  void msg()throws ArithmeticException{System.out.println("parent2");}  
}

class TestExceptionChild3 extends Parent2{  
	  void msg() throws ArithmeticException{System.out.println("child3");}  
}

class TestExceptionChild4 extends Parent2{  
	  void msg() throws NullPointerException{System.out.println("child4");}  
}

class TestExceptionChild5 extends Parent2{  
	  void msg(){System.out.println("child5");}   
}

/*class TestExceptionChild6 extends Parent2{  
	  void msg() throws Exception{System.out.println("child6");}   
}*/

public class excepOverridingRule2 {
	public static void main(String args[]){  
		Parent2 p3=new TestExceptionChild3();  
		p3.msg();
		Parent2 p4=new TestExceptionChild4();  
		p4.msg();
		Parent2 p5=new TestExceptionChild5();  
		p5.msg();
		//Parent2 p6=new TestExceptionChild6();  
		//p6.msg();
	}
}

