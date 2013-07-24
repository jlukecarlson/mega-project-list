package projects;

public class PigLatin {
	public static void main(String[] args) {
		PigLatin("Banana");
		PigLatin("example");
	}
	private static void PigLatin(String inputString) {
		char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char firstChar = inputString.toLowerCase().charAt(0);
		String pigLatin = "";
		Boolean consonantFirst = false;
		for (char consonant : consonants) {
			if(firstChar == consonant){
				pigLatin = inputString.replaceFirst(String.valueOf(inputString.charAt(0)), "") + consonant + "ay";
				System.out.println(pigLatin);
				consonantFirst = true;
				break;
			}
		}
		if(consonantFirst == false){
			pigLatin = inputString + "way";
			System.out.println(pigLatin);
		}
	}
}