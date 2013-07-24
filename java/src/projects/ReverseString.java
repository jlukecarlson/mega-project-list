package projects;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString("meow");
	}
	private static void ReverseString(String inputString) {
		String reverseString = "";
		int num = inputString.length() - 1;
		for(int i = 0; i < inputString.length(); i++) {
			reverseString += inputString.charAt(num);
			num--;
		}
		System.out.println(reverseString);
	}
}