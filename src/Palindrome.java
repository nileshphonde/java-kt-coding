public class Palindrome {

	public static void main(String args[]) {
		
		int num = 121;
		int reverse = 0;
		int digit;
		int orig = num;

		while (num > 0) {
			digit = num%10;
			reverse = (reverse * 10) + digit;
			num = num / 10;
		}

		if(orig == reverse) {
			System.out.println(orig + " is a palindrome.");
		} else {
			System.out.println(orig + " is not a palindrome.");
		}			
	}
}