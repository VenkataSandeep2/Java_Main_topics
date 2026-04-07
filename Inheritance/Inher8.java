//heirchacal inher
class A
{
protected String s;
	public void reada()
	{
	s=" San";
	}
}
class B extends A
{
protected int no;
	public void readb()
	{
	no=201;
	}
	public void printB()
	{
	System.out.println("student details: "+s+" "+no);
	}
}
class Third extends A
{
private double marks;
	public void readc()
	{
	marks=80.6;
	}
	public void printThird()
	{	
	System.out.println("student marks : "+s+" "+marks);
	}
}
class Inher8
{
public static void main(String args[])
	{
	B b=new B();
	b.reada();
	b.readb();
	b.printB();
	
	Third c = new Third();	
	c.reada();
	c.readc();
	c.printThird();
	}
}