package interfacedemo;

interface Shape
{
	int width=10;
	int length=20;
	
	void circle(); // abstract method*not implemented)
	
	default void square ()   //default method
	{
		System.out.print("This is a square");
	}
	
	
	static void  rectangle() 	//static method (this method can be accessed by an interface itself not with an object)
	{
		System.out.print("This is a rectangle");
	}
	
}


//by nature, in class methods are default type, in interface methods are public so to 
//use abstract method in class we have to specify the method type as public. because 
//public is higher than default type




public class Interface implements Shape
{
	
public void circle() 
{
	System.out.print("This is a circle");
}

	public static void main(String[] args) 
	{
	
		Interface idobj = new Interface();
		
		idobj.circle();
		idobj.square();
		Shape.rectangle(); // static methods can be accessed by interface directly no need for the object
		
		
		//Shape sh= new Shape(); //incorrect
		
		Shape sh = new Interface(); // interface variable can hold the object of an implemented class of the interface
		sh.circle();
		sh.square();
		
		
		

	}

}
