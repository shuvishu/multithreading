package com.threading.Assignment;

class PrintEven implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=20;i+=2)
		{
			
			try {
				System.out.println("by t1 "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class PrintOdd extends Thread{
	@Override
	public void run() {
		
		for(int i=1;i<20;i+=2)
		{
			
			try {
				System.out.println("by t2 "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}




public class Ques1 {
	public static void main(String[] args) {
		Thread t=new Thread(new PrintEven());
		PrintOdd pt=new PrintOdd();
		t.start();
		pt.start();
	}
}
