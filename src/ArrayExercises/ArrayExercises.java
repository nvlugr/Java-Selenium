package ArrayExercises;

import java.util.Arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		
		//1) Find Sum of Elements in Array
		//a={1,2,3,4,5}


int array_sum[]= {2,4,6,8};
int sum=0;
		
		for(int n=0; n<array_sum.length; n++) {
			
			
			sum= sum +array_sum[n];
			
		}
		
		System.out.println("Sum is " + sum);
		

		//2) Print Even and Odd numbers  from array.
          int a[]={1,2,3,4,5,6,7,8,9,2,2};
          int even=0;
          int odd=0;

          for(int i=0; i<a.length; i++) 
          {
        	  if(a[i]%2==0) {
        		  even++;
        	  } else {
		
        		  odd++;
	}
} 
          System.out.println("Even " + even+ " odd "+odd);
          
      
//3) Search an element in array

int array[]= {10,20,30,40};
int find_number=10;
for(int d=0; d<array.length;d++) {
	if(array[d]==find_number) {
		
		  System.out.println("Number is "+find_number);
	}
}


//4) Sorting elements
int sort_array[]= {50,20,60,700,500}; 
int sorted[];

for(int b=0; b<sort_array.length-1;b++) {
	
if(sort_array[b]>sort_array[b+1]) {
	int big =sort_array[b];
	int small =sort_array[b+1];
	sort_array[b]= small;
	sort_array[b+1]=big;

			}
		}

			System.out.println(Arrays.toString(sort_array));

	}
}
