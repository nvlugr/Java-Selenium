package collectionsAndArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//Declaration
		
		//HashMap hm= new HashMap();
		//Map hm =new Map();
		HashMap <Integer,String> hm=new HashMap <Integer,String> ();
		
		//Adding data to HashMap
		
		hm.put(101, "Neval");
		hm.put(102, "Muco");
		hm.put(103, "Mun");
		hm.put(104, "Ley");
		
		System.out.println(hm);
		
		//Finding the size
		
		System.out.println(hm.size());
		
		//Removing the pair
		
		hm.remove(101);
		System.out.println("After removal "+ hm);
		
		//Take specific pair with key
		
		System.out.println(hm.get(102));
		
		
		// print only keys
		
		System.out.println(hm.keySet());
		
		//print only values
		
		for(Object k:hm.keySet())
		{
			System.out.println(k+"		"+hm.get(k));
		}
		
		//clear the HashMap
		
		hm.clear();
		System.out.println(hm);
		
		
		

	}

}
 