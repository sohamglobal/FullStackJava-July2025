package com.sharayu.programs;

class Soham extends Thread
{
	public void run()
	{
		for(int i=1;i<=25;i++)
		{
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("thread interrupted...");
			}
		}
		System.out.println("thread terminated...");
	}
}


public class TimedWaiting {
	public static void main(String[] args) {
		Soham obj=new Soham();
		Thread t1=new Thread(obj);
		t1.start();
	}

}
