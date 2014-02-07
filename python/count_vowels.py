def count_vowels(string):
	vowels = ['a', 'e', 'i', 'o', 'u']
	lower_string = string.lower()
	vowel_count = 0
	for char in lower_string:
		for vowel in vowels:
			if char == vowel:
				vowel_count+=1
	return vowel_count

print count_vowels("This is a sentence with vowels")
print count_vowels("There are 6 vowels")
