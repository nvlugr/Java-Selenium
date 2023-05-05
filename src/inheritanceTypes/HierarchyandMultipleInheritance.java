package inheritanceTypes;

class Parent
{
	void display(int a) 
		{
		
		System.out.println(a);
	
		}
}

class Child1 extends Parent
{
	void show(int b) 
	{
		
	System.out.println(b);

	}
}

class Child2 extends Parent
{
	void print(int c) 
	{
		
	System.out.println(c);

	}
}









public class HierarchyandMultipleInheritance {

	public static void main(String[] args) {
		
		//Hierarchy Inheritance 
		
		Child1 ch1 = new Child1();
		ch1.display(1);
		ch1.show(2);
		
		Child2 ch2= new Child2();
		ch2.display(10);
		ch2.print(20);
		
		
		//Multiple Inheritance is not possible with Class in java. It is only possible with interface concept.
		//Multiple Inheritance = Two parents and one child

	}

}
