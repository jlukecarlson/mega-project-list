package projects;

public class CoutVowels {
	public static void main(String[] args) {
		CountVowels("This is a sentence with vowels");
		CountVowels("There are 6 vowels");
	}
	private static void CountVowels(String inputString) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int vowelCount = 0;
		for (char inputCh: inputString.toCharArray()) {
			for(char vowel: vowels){
				if(inputCh == vowel){
					vowelCount++;
				}
			}
		}
		System.out.println(vowelCount);
	}
}
