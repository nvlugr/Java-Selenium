package JavaArrays;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		
	//Print a value of an array
		
    System.out.println(a[1]);
     
    //Print the length of an array 
     
 	int arr[]= {100,200,300,400};
	
 	System.out.println(arr.length);
 	
 	//Print all values of an array
     
 	System.out.println(Arrays.toString(arr));
 	
 	//Get all the values by using for loop
 	
 	for(int i=0; i<arr.length;i++) {
 		
 		System.out.println(arr[i]);
 	}
 	
 	//Enhanced for loop
 	
 	for(int x:arr) {
 		
 		System.out.println(x);
 	}
 	
 	//Two-dimensional array
 	
 	int two_arr[][]= new int[3][2];
 	
 	two_arr[0][0]=100;
 	two_arr[0][1]=200;
 	two_arr[1][0]=300;
 	two_arr[1][1]=400;
 	two_arr[2][0]=500;
 	two_arr[2][1]=600;
 	
 	System.out.println("Two dimensional array is like "+ two_arr[1][1]);
 	
 	
 	//Way 2
 	 int arr2[][]= {
 			 {100,200},
 			 {300,400},
 			 {500,600} 
 	 };
 	
 	System.out.println(arr2[1][1]);
 	
 	//Length of an array
 		
 		//Rows
 	
 	System.out.println(arr2.length);
 	
 		//Columns
 	
 	System.out.println(arr2[0].length);
 	
 	//Print rows and columns with for loop
 	
 	int arr3[][]= {
 			
 			{100,200,800},
 			{300,400,900},
 			{500,600,1000}
 	} ;
 	
 	for(int i=0; i<arr3.length; i++) {
 		
 		
 		 for(int k =0; k< arr3[i].length; k++){
 			 
 			 System.out.print(arr3[i][k]+  " ");
 		 }
 		 
 		System.out.println();
 	}
 	
 	
 	
 	//Print all data of array with enhanced for loop
 	
 	for(int x[]:arr3) {
 		
 		for(int y:x) {
 			
 			System.out.print(y + " ");	
 		}
 		
 		System.out.println();
 		
 	}
 	
 	//Object type of array
 	
 	
 	Object obj_arr[] = new Object[3];
 	
 	obj_arr[0]="Welcome";
 	obj_arr[1]=0.5;
 	obj_arr[2]=123;
 	
 	for(int i=0; i<obj_arr.length;i++) {
 		System.out.println(obj_arr[i]);
 	}
 	
 	for(Object q:obj_arr) {
 		
 		System.out.println(q);
 	}
  }
}
