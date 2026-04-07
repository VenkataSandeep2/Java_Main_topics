//multilevel Inheri
class A
{
protected String s;
	public void reada()
	{
	s="San";
	}
}
class B extends A
{
protected int x;
	public void readb()
	{
	x =21;
	}
}
class C extends B
{
protected String s1;
	public void readc()
	{
	s1 = "Cls";	
	}

}

class D extends C
{
private double y;
	public void readd()
	{
	y = 75.5;
	}
	public void print()
	{
	System.out.println(s+"  "+x+"  "+s1+"  "+y);
	}
}
class Inher7
{
public static void main(String args[])
	{	
	D d=new D();
	d.reada();
	d.readb();
	d.readc();
	d.readd();
	d.print();
	
	}

}