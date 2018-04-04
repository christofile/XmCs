package L1S9;
import java.util.Random;

class RandomNum{
	public static int n=0;
}

class MyThread1 extends Thread{
	public void run() {
			Random rand = new Random();
			RandomNum.n = rand.nextInt(100);
			System.out.println("Original number is "+RandomNum.n);
	}
}

class MyThread2 extends Thread{
	public void run() {
		int square=0;
		int num=RandomNum.n;
		if(num%2==0) {
			square=num*num;
			System.out.println("Square number is "+square);
		}
			
	}
}

class MyThread3 extends Thread{
	public void run() {
		int cubic=0;
		int num=RandomNum.n;
		if(num%2!=0) {
			cubic=num*num*num;
			System.out.println("Cubic number is "+cubic);
		}
			
	}
}



public class MultiThread1 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<5;i++) {
			MyThread1 t1 = new MyThread1();
			t1.start();	
			MyThread2 t2 = new MyThread2();
			t2.start();
			MyThread3 t3 = new MyThread3();
			t3.start();
			MyThread1.sleep(1000);
		}	
	}
}
