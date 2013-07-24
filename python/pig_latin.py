def pig_latin(string):
	string = string.lower()
	consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
	first_letter = string[0]
	pig_latin = ''
	for consonant in consonants:
		if first_letter == consonant:
			pig_latin = string.split(consonant, 1)[1] + first_letter +"ay"
			return pig_latin
	else:
		pig_latin = string + "way"
		return pig_latin

print pig_latin("Banana")
print pig_latin("example")