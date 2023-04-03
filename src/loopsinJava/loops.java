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
	
		}
	}
