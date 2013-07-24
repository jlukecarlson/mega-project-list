def count_words(text):
	return str(len(text.split(" "))) + " words in the analyzed text"

def count_from_file(file_location):
	file = open(file_location, 'r')
	text = str(file.read())
	return count_words(text)

print count_words("This is a sentence with 7 words")
print count_from_file("paragraph.txt")