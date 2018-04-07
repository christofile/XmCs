package L1S8;

import java.util.Random;

class RandomNum2{
	public static int n=0;
}

class MyMultiThread1 extends Thread{
	public void run() {
			Random rand = new Random();
			RandomNum2.n = rand.nextInt(100);
			System.out.println("Original number is "+RandomNum2.n);
	}
}

class MyMultiThread2 extends Thread{
	public void run() {
		int num=RandomNum2.n;
		if(num<50) {
			System.out.println("Citrix");
		}
			
	}
}

class MyMultiThread3 extends Thread{
	public void run() {
		int num=RandomNum2.n;
		if(num>50) {
			System.out.println("Systems");
		}
			
	}
}



public class MultiThread2 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<5;i++) {
			MyMultiThread1 t1 = new MyMultiThread1();
			t1.start();	
			MyMultiThread1.sleep(1000);
			MyMultiThread2 t2 = new MyMultiThread2();
			t2.start();
			MyMultiThread3 t3 = new MyMultiThread3();
			t3.start();
			
		}	
	}
}
