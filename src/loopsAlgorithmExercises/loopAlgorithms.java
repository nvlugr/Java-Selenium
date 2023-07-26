package loopsAlgorithmExercises;

public class loopAlgorithms {

	public static void main(String[] args) {
		// 1.Reverse a number

		int rev = 0;
		int num = 1234;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse number is " + rev);

		// 2.Palindrome Number

		int r = 0;
		int n = 121;
		int n2 = n;

		while (n != 0) {

			r = r * 10 + n % 10;
			n = n / 10;
			if (r == n2) {

				System.out.println(n2 + " is a Palindrome number");

			}
		}

		// 3.Count numbers of digit in a number

		int i = 1;
		int numb = 123679;

		while (numb >= 10) {

			numb = numb / 10;
			i++;
		}

		System.out.println(i);

		// 4.Count odd and even numbers of digits in a number

		int number = 744876234;
		int last_digit;
		int even = 0;
		int odd = 0;

		while (number > 0) {

			last_digit = number % 10;
			if (last_digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			number = number / 10;
		}

		System.out.println("Even " + even + " odd " + odd);

		// 5. Find sum of digits in a number

		int numo = 6000;
		int total = 0;
		int rem;

		while (numo > 0) {
			rem = numo % 10;
			total = total + rem;
			numo = numo / 10;
		}

		System.out.println("Total of digits is " + total);
	}
}
