package methodsandConstructors;

public class Greetings {

	//No parameters-No return
	
	void greeting1() 
	{
		
		System.out.println("Hello...");
	}
	
	
	//No parameters-Returns a value
	
	String greeting2()
	{
		return "How are you?";
	}
	
	//Takes parameters-No return value
	
	void greeting3(String name)
	{
		System.out.println("Hello "+ name);
	}
	
	
	//Takes parameters-Returns a value
	
	String greeting4(String name)
	{
		return ("Hello "+ name);
	}
}
