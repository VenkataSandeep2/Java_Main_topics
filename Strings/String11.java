class String11
{

public static void main(String args[])
	{
	String s = "Sandeep";
	int firstIndex = s.indexOf('s');
	System.out.println("The first index of : " + firstIndex);
	System.out.println();
	int lastIndex = s.indexOf('e');
	System.out.println("The first index of : " + lastIndex);
	
	int subIndex = s.indexOf("sa");
	System.out.println("Substring of the (1,1) : " + subIndex);	
	
	}
}