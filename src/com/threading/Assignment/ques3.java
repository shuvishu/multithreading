package com.threading.Assignment;

class Print1 extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
		{
			
			try {
				System.out.println(1);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Print2 extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
		{
			
			try {
				System.out.println(2);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Print3 extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
		{
			
			try {
				System.out.println(3);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


public class ques3 {
	public static void main(String[] args) {
		Print1 p1=new Print1();
		Print2 p2=new Print2();
		Print3 p3=new Print3();
		p1.start();
		p2.start();
		p3.start();
	}
}
