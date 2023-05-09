package accessModifiers;

//Access modifiers are public, protected, default, private
//Private variables and methods only accessible in the class
//If nothing specified it is default: we can access them within the package
//Protected: we can access them with inheritance in other packages
//Public: we can access them everywhere without inheritance.


public class AccessModifiers {

	public static void main(String[] args) {
		//Can access the default variable and method outside of the class in the package
		
		Test t =new Test ();
		System.out.println(t.x);
		t.m1();

	}

}
