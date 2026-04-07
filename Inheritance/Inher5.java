//Multilevel Inheri
class Class
{
protected int s ;		//s=Students
	public void reada()
 	{
	s= 65;
	}

}
class Present extends Class
{
protected int p ; 		//present 
	public void readb()
	{
	p=52;
 	}

}

class Absents extends Present
{
private int c ;			//a= absents
	public void readc()
	{
	c = s - p;
	}
	public void print()
	{
	System.out.println("No of Students in the class : " +s);
	System.out.println("No of Students presents in the class :" +p);
	System.out.println("No of Students absents in the class :" +c);

	}
}
class Inher5
{
public static void main(String args[])
	{
	Absents ab= new Absents();
	ab.reada();
	ab.readb();
	ab.readc();
	ab.print();
	}
}
