class String7
{
public static void main(String args[])
	{
	String s = new String("Siva");
	String s1 = new String("siva");		//replace the string names
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());

	System.out.println();

	boolean res =s.equals(s);		
	System.out.println("result : " +res);
	
	res = s.equalsIgnoreCase(s1);		//equals ignore the lowercase & uppercase
	System.out.println("result : "+res);

	System.out.println();
	res = s.matches(s1);			//object is match
	System.out.println("final result :- " + res);	
	}
}