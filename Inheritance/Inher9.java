//heirchacal inher
class First
{
protected String N;
	public void reada()
	{
	N=" KHIT";
	}
}
class Second extends First
{
protected int s;
	public void readb()
	{
	s=3500;
	}
	public void printB()
	{
	System.out.println("Collage details: "+N+" "+s);
	}
}
class Third extends First
{
private int No;
	public void readc()
	{
	No=515;
	}
	public void print()
	{	
	System.out.println("Roll no : "+N+" "+No);
	}
}
class Inher9
{
public static void main(String args[])
	{
	Second b=new Second();
	b.reada();
	b.readb();
	b.printB();
	
	Third c = new Third();	
	c.reada();
	c.readc();
	c.print();
	}
}