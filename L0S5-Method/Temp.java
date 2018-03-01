


public class Temp{
	
	int x;
	int y;

	Temp(int x){
		this.x=x;
	}

	Temp(int x,int y){
		this.x=x;
		this.y=y;
	}

	void disp(){
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

	public static void main(String[] args) {
	        // write your code here
	        
	        Temp obj1 = new Temp(1);
	        obj1.disp();
	        Temp obj2 = new Temp(1,2);
	        obj2.disp();

	    }
}