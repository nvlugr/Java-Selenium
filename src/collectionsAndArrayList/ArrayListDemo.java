package collectionsAndArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		 ArrayList myList =new ArrayList();
		 
		//ArrayList <String> myList =new ArrayList <String> ();
		 
		// myList = new ArrayList();
		 
		 
		//Adding data to ArrayList
		 
		 myList.add(100);
		 myList.add(20.04);
		 myList.add(null);
		 myList.add("welcome");
		 myList.add(true);
		 
		 System.out.println(myList);
		 
		 //Size of ArrayList
		 
		 System.out.println(myList.size());
		 
		 //Removing an element
		 
		 System.out.println(myList.remove(1));
		 
		 //Inserting an element into the middle
		 
		 myList.add(0,"neval");
		 System.out.println(myList);
		 
		 //Get any value from the ArrayList
		 
		 System.out.println( myList.get(0));
		 
		 //Get all data one by one
		 
		 for(Object x:myList) 
		 {
			 System.out.println(x);
		 }
		 
		 //Clear all the data
		 
		 myList.clear();
		 System.out.println(myList);
	}

}
