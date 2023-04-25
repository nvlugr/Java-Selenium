package methodsandConstructors;

public class ConstructorDemo {
	
	int x,y;
	String s;
	
	/*ConstructorDemo() //default constructor
	{
		
	x=100;
	y=200;
	s="hello";
	
	}*/
	
	
	ConstructorDemo(int a, int b, String str)
	{
	x=a;
	y=b;
	s=str;
	}
	
	void displayData()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	
	

	public static void main(String[] args) {
		
		ConstructorDemo cd=new ConstructorDemo(10,20,"hi");
		cd.displayData();

	}

}
