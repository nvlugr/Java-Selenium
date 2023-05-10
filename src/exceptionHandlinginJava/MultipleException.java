package exceptionHandlinginJava;

public class MultipleException {

	public static void main(String[] args) {
		String s =null;
		try 
		{
			System.out.println(s.length());

		}
		catch (Exception e)
		{
			System.out.println("Exception is thrown.");

		}
	}

}
