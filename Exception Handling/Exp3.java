package com.practise;

public class Exp3
{

	public static void main(String[] args) 
	{

		
		int x[]= {7};
		
		try {
		int num  =Integer.parseInt(args[51]);
		System.out.println(num);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
			System.out.println("Hiiii");
		}
		System.out.println("broooooooo");
	}
}
