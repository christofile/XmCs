package L1S9;

import java.util.Random;

class RandomNum3{
	public static int n=0;
}

class MyMThread1 extends Thread{
	public void run() {
			Random rand = new Random();
			RandomNum3.n = rand.nextInt(10);
			System.out.println("Original number is "+RandomNum3.n);
	}
}

class MyMThread2 extends Thread{
	public void run() {
		int num=RandomNum3.n;
		int i,fact=1;   
		for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		if(num%2!=0) {
			System.out.println(fact);
		}
			
	}
}

class MyMThread3 extends Thread{
	public void run() {
		int num=RandomNum3.n;
		if(num%2==0) {
			System.out.println(num*num);
		}
			
	}
}



public class MultiThread3 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<5;i++) {
			MyMThread1 t1 = new MyMThread1();
			t1.start();	
			MyMThread2 t2 = new MyMThread2();
			t2.start();
			MyMThread3 t3 = new MyMThread3();
			t3.start();
			MyMThread1.sleep(10000);
			
		}	
	}
}
