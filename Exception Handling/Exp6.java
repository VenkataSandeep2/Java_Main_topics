class Exp6
{
public static void main(String args[])
	{
	Thread t = Thread.currentThread();
	try{
	t.start();
	}catch(IllegalThreadStateException its)
		{
		System.out.println(its);
		}

	System.out.println();	
	System.out.println("Hiiiiiiiii");
	}
}
