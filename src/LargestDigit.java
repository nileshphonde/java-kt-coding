public class LargestDigit {

	public static void main(String args[]) {
		
		int num = 27463;
		int orig = num;
		int top = 0;
		int digit;

		while (num > 0) {
			digit = num % 10;
			if ( top < digit ) {
				top = digit;
			} 
			num = num / 10;
		}

		System.out.println("The largest digit in " + orig + " is " + top);
		
	}
}