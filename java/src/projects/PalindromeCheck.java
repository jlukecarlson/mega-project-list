package projects;

public class PalindromeCheck {
	public static void main(String[] args) {
		PalindromeCheck("racecar");
		PalindromeCheck("poop");
	}
	private static void PalindromeCheck(String inputString) {
		if (inputString.length() % 2 == 0) {
			// even
			int num = inputString.length()-1;
			String firstHalf = inputString.substring(0, inputString.length() / 2);
			String secondHalf = "";
			while(num >= inputString.length() / 2){
				secondHalf += inputString.charAt(num);
				num--;
			}
		System.out.println("Is " + inputString + " a palindrome? " + firstHalf.equals(secondHalf));
		//System.out.println(firstHalf + " = " + secondHalf);
		} else {
			// odd
			int num = inputString.length()-1;
			String firstHalf = inputString.substring(0, inputString.length() / 2);
			String secondHalf = "";
			while(num >= inputString.length() / 2 +1){
				secondHalf += inputString.charAt(num);
				num--;
			}
		System.out.println("Is " + inputString + " a palindrome? " + firstHalf.equals(secondHalf));
		//System.out.println(firstHalf + " = " + secondHalf);
		}
	}
}