package exceptionHandlinginJava;

public class MultipleException {

	private static String s;

	public static void main(String[] args) {
		s = null;
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
