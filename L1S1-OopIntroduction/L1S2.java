abstract class Base
{
	public abstract void display();
	
}

class Child extends Base
{
	public void display(){
		System.out.println("Citrix Systems");
	}
}

public class L1S2
{
   public static void main(String args[]) {
	   Base b=new Child();
	   b.display();
   }
}