//heirchacal inher
class Vehicle
{
protected String s; 	//vehcile name
	public void reada()
	{
	s= "Start";
	}

}
class Car extends Vehicle
{
private String x;
private  long l;
	public void readb()
	{	
	x="Benz";
	l=201508;
	}
	public void printA()
	{
	System.out.println(s);
	System.out.println(x+" "+l);
	}
}

class Bike extends Vehicle
{
private String s1;
private int c;	//model
	public void readc()	
	{
	s1="Ninja";
	c= 2022;
	}
	public void printB()
	{
	System.out.println(s);
	System.out.println(s1+" "+c);
	}
}
class Inher10
{
public static void main(String args[])
	{	
	Car z=new Car();
	z.reada();
	z.readb();
	z.printA();
	
	Bike q=new Bike();	
	q.reada();
	q.readc();
	q.printB();
	}	

	
	
}