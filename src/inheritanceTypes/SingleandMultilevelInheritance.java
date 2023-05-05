package inheritanceTypes;

//Single Inheritance

class A
{
int x=100;

void display() 
{
System.out.println(x);
}

}

class B extends A
{
	int y=200;
	void show()
	{
		System.out.println(y);	
	}
}

// Multilevel Inheritance

class C extends B 
{
int z;
void print() 
{
	System.out.println(z);		
}
}


public class SingleandMultilevelInheritance {

	public static void main(String[] args) {
		
		B boj= new B();
		
		boj.display();
		boj.show();
		
		C cobj =new C();
		cobj.z=400;
		cobj.print();
		cobj.show();

	}

}
