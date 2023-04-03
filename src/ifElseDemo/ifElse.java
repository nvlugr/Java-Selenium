package ifElseDemo;

public class ifElse {

	public static void main(String[] args) {
		

		//largest of 2 numbers (if else and ternary)
		
		int a=10;
		int b=20;
		
		if (a>b) {
			  System.out.println("a>b");
			} else {
				System.out.println("b>a");
			}
		
		//smallest of 3 numbers if...else
		
		int x=6;
		int y=8;
		int z=10;
		
		if (x<y && x<z) {
			  System.out.println("The smallest number is x");
			} else if (y<x && y<z) {
				System.out.println("The smallest number is y");
			} else {
				System.out.println("The smallest number is z");
			}
		
		//print month name by taking numbers via switch

		int month=10;
		
		switch (month) {
		  case 1:
		    System.out.println("January");
		    break;
		  case 2:
		    System.out.println("February");
		    break;
		  case 3:
		    System.out.println("March");
		    break;
		  case 4:
		    System.out.println("April");
		    break;
		  case 5:
		    System.out.println("May");
		    break;
		  case 6:
		    System.out.println("June");
		    break;
		  case 7:
		    System.out.println("July");
		    break;
		  case 8:
			System.out.println("August");
			    break;
		  case 9:
		    System.out.println("September");
			  break;
		  case 10:
			System.out.println("October");
			  break;
		  case 11:
			System.out.println("November");
			  break;
		  case 12: 
			System.out.println("December");
		  default:
		    System.out.println("Invalid month number");
		}		
	}
}
