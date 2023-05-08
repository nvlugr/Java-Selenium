
//Multiple Inheritance with one class and 2 interfaces by implementing and extending to another class

package multipleInheritancewithInterfaces;

public class ClassMain extends ClasstoInherit implements Interface1, Interface2
{
	public void m2() 
	{
		System.out.println("This is a m2 interface");
		System.out.println(y);
		
	}


	public void m1() {
		
		System.out.println("This is a m1 interface");
		System.out.println(x);
	}

	
	public static void main(String [] args) 
	
	{
		ClassMain newobj = new  ClassMain();
		newobj.m1();
		newobj.m2();
		newobj.m3();
		
	}
}



