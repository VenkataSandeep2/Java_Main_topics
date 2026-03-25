//multilevel Inheri
class First
{
protected int x;
	public void reada()
	{  
	x= 10;
	}
}
class Second extends First
{
protected int y;
	public void readb()
	{
	y=20;
	}
}

class Third extends Second
{
private int z;
	public void readc()
	{
	z=30;
	}
	public void print()
	{
	System.out.println("x: "+x);
	System.out.println("y: "+y);
	System.out.println("z: "+z);
	}
}

class Inheri3
{
public static void main(String args[])
	{
	Third t = new Third();
	t.reada();
	t.readb();
	t.readc();
	t.print();
	}

}
