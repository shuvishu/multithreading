package com.threading.Assignment;

interface CheckPrime{
	public boolean check(int x);
}

class PrintPrime implements Runnable{

	@Override
	public void run() {
		
		CheckPrime ck=(int x)->{
			boolean flag=true;
			if(x==2||x==1){
				return flag;
			}
			int k=x/2;
			for(int j=2;j<=k;j++)
			{
				if(x%j==0)
				{
					flag=false;
					return flag;
				
				}
			}
			return flag;
	};
		
		for(int i=1;i<=20;i++)
		{
			if(ck.check(i))
				System.out.println("prime "+i);
			
		}
	}
	
}

class PrintNonPrime extends Thread{
	@Override
	public void run() {
		CheckPrime ck=(int x)->{
			boolean flag=true;
			if(x==2||x==1){
				return flag;
			}
			int k=x/2;
			for(int j=2;j<=k;j++)
			{
				if(x%j==0)
				{
					flag=false;
					return flag;
				
				}
			}
			return flag;
	};
		for(int i=1;i<20;i++)
		{
			
			if(!ck.check(i))
				System.out.println("non prime "+i);
			
		}
		
	}
}




public class Ques2 {
	public static void main(String[] args) {
		Thread t=new Thread(new PrintPrime());
		PrintNonPrime pt=new PrintNonPrime();
		t.start();
		pt.start();
	}
}
