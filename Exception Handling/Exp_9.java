import java.util.*;
public class Exp_9 {

	public static void main(String[] args) 
	{	
		String s[] = {"Ravi","Raju","Siva","Venky"};
		List li =Arrays.asList(s);
			try {
		li.clear();
		
		System.out.println("Values of the list :- "+li);
			}
			catch(UnsupportedOperationException Uoe)
			{
				System.out.println(Uoe);
			}
		System.out.println("Hiiiiiiiii");
	}
}

            // OUTPUT
            //   java.lang.UnsupportedOperationException
            // Hiiiiiiiii

