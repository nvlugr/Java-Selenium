package exceptionHandlinginJava;

import java.util.Scanner;

public class Ecxeption {

	public static void main(String[] args) 
	{
		
		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int num= sc.nextInt();
		
		try 
		{
			System.out.println(100/num);	
		}
		catch(ArithmeticException e)
		{	e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("You have entered an invalid number.");
		}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		
		
		

		
	}

}
