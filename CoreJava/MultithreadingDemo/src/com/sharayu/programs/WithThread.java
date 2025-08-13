package com.sharayu.programs;

public class WithThread extends Thread {
	
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i+" "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		WithThread obj1=new WithThread();
		WithThread obj2=new WithThread();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		System.out.println("Object-1");
		t1.start();
		System.out.println("Object-2");
		t2.start();
	}

}

/*
Object-1
Object-2
1 Thread-2
1 Thread-3
2 Thread-3
3 Thread-3
4 Thread-3
5 Thread-3
2 Thread-2
3 Thread-2
4 Thread-2
6 Thread-3
5 Thread-2
6 Thread-2
7 Thread-2
7 Thread-3
8 Thread-2
8 Thread-3
9 Thread-2
9 Thread-3
10 Thread-3
10 Thread-2
 */

