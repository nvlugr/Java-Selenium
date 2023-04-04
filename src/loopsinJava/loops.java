package loopsinJava;

public class loops {

	public static void main(String[] args) {
		 // While Loop - Print numbers from 1 to 10	
			    int i=1;
				while(i<=10) {
						System.out.println(i);
							i++;
			}
		// Write "Hello" 3 times
				int a=1;
				while(a<=10) {
					System.out.println("Hello");
					a++;
				}
				
			//Print even numbers between 1-10
				//Way1
				int b=0;
				while(b<10) {
					b=b+2;
					System.out.println(b);
				}
				//Way2
				int c=0;
				while(c<10) {
					if(c%2==0) {
						c=c+2;
						System.out.println(c);	
					}
				}
	
			//Decrement in loop
				int q=10;
				while(q>=1) {
					System.out.println(q);
					q--;
				}
			//do...while loop (down->up)
				//Write from 1 to 10
				
				int m=1;
				do
				{
				System.out.println(m);	
				m++;	
				} while(m<10);
				
				//Write from 10 to 1
				
				int n=10;
				do
				{
				System.out.println(n);	
				n--;	
				} while(n>=1);
			
				//While vs do...while
				//While loops logs nothing
				
				int l=10;
				while(l<=5) {
					System.out.println(l);
					l++;
				}
				
				//Do...while loop logs at least one time without checking the condition
				
				do {
					
					System.out.println("here is a do...while " + l);
					l++;
					
				}while(l<=5);
				
				
				
			//For Loop
				
				for(int k=0;k<=10;k++) 
				{
					System.out.println("This is k= "+k);
				}	
				
				
				//Print out even numbers
				for(int y=0; y<=10; y++)
				{
					if(y%2!=0) {
						
						System.out.println("This is y= "+y);
						
					}
						
				} 
		
		
		
		
		
		}
	}
