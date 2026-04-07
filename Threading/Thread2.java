package com.multi_Threading;

class myclass extends Thread
{
	public void run()
	{
	for(int i = 1; i<= 5; i++)
	{
		System.out.println("child thread " +i);
	}
	}	
}
class Thread2
{
	public static void main(String args[])
	{
		myclass m = new myclass();
		m.start();
		
		Thread t = Thread.currentThread();
		t.setName("Main Thread");
		for(int i = 1; i<=5; i++)
		{
			System.out.println(i);
		}
	
	}
}
