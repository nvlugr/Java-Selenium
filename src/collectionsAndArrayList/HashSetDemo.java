package collectionsAndArrayList;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		HashSet mySet =new HashSet();
		
			// Set mySet = new HashSet();
			//HashSet <String> mySet =new HashSet<String>();
		
		//Adding data to HashSet
		
		mySet.add(100);
		mySet.add("hello");
		mySet.add(null); //just 1 null is allowed
		mySet.add(null);
		mySet.add(100); //duplicates not allowed
		
		System.out.println(mySet); //insertion order not preserved
		
		System.out.println(	mySet.size());
		
		//Removing data from HashSet
		
		mySet.remove("hello");
		System.out.println("After removing "+ mySet);
		
		//insert and get methods are not possible in Hashsets bcz they do not have index
		
		//to get data we use for loop
		
		for(Object x:mySet)
		{
		System.out.println(x);	
		}
		
		
		
		
	
	
	}

}
