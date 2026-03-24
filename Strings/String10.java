class String10
{
public static void main(String args[])
	{
	String s = "Venkata Sandeep";
	System.out.println("The start with of string : " +s.startsWith("san"));
	System.out.println("The String ends with San " +s.endsWith(s));

	System.out.println();

	String s1 = "San";
	System.out.println("The String ends with san " +s1.endsWith(s1));
	
	System.out.println("The String starts with venkata san " +s1.startsWith("Venkata San",6));

	}
}