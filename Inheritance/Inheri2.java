class A
{
protected int a;
	public void reada()
	{
	a = 15;
	}
}
class B extends A
{
private int b;
	
	public void readb()
	 {
	b=25;
	 }
	public int add(int a,int b)
	{
	return a+b;		//System.out.println(a+b);
	}
	public void print()
	{
	System.out.println(a+" "+b);
	}
	

}
class Inheri2
{
 public static void main(String Args[])
	 {
	B b=new B();
	b.reada();
	b.readb();
	System.out.println("Sum :"+b.add(15,25));
	b.print();
	}


}
