public class ReverseNumber {
	public static void main(String args[]) {
		
		int num = 4321;
		int reverse = 0;
		int digit;

		while (num > 0) {
			digit = num%10;
			reverse = (reverse * 10) + digit;
			num = num / 10;
		}
		System.out.println("The reverse is: " + reverse);			
	}
}