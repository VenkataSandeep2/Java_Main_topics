class Student
{

private int sno;
	String sname;
	public void read()
	{	
	sno = 101;
	sname = "Sanjay";
	}
	public String toString()
	{
	return sno+ "	"+ sname;
	}
}
class String6
{

public static void main(String args[])
	{
	Student s= new Student();
	s.read();
	System.out.println(s);
	}

}