package com.practise;

import java.util.*;

public class Exp1 {
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a values");
		a = sc.nextInt();
		b = sc.nextInt();
		{
			try {
				c = a/b;
				System.out.println("Result : " +c);
			}catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
		}
		System.out.println("hiiiiiiiiiiii");
	}
}
