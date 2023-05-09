package wrapperClass;

public class Wrapper {

	public static void main(String[] args) 
	{
		
	//	int a=100;  primitive data
		
		Integer a=100; //Wrapper class-Object
		
		byte b=10;
		
		Byte byteobj= b; // it turns the b primitive data to an object
		System.out.println(b); //This is Autoboxing
		
		byte byteprimitive =byteobj; //Unboxing: converting object to a primitive type
	
	// Data Convertion Function
		
		//String to Integer: Integer.parseInt()
		//String to Double: Double.parseDouble()
		//Str'ng to Boolean: Boolean.parseBoolean()
		//From String to other data types: String.valueOf(data) (string to char is not possible bcz char is just one character)
		
		//Data Converting Methods
		
			String s1="10";
			String s2="20";
			System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
			
			int i=100;
			String newi=String.valueOf(i);
			System.out.println(newi+s1);
			
	}
	
	
	
}
