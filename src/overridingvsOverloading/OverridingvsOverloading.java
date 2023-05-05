package overridingvsOverloading;

class ABC 
{
	void display(int a)
	{
		System.out.println(a);
	}
	
	void show(int i)
	{
		System.out.println(i);
	}
}

class XYZ extends ABC
{
	void display(int a)
	{
		System.out.println(a*a); //overriding: just changing the body of the method
	}
	
	void show(int a, int b)
	{
		System.out.println(a*b); //overloading: changing variables and the body 
	}
}






public class OverridingvsOverloading {
	
	public static void main(String[] args) {
		
		XYZ xyz=new XYZ();
		
		xyz.display(3); //override
		xyz.show(4); //overload
		xyz.show(4, 3); //overload
		
		
	
		

	}

}
