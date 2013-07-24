def reverse_string(string):
	reverse_string = ''
	num = len(string) - 1
	for i in string:
		reverse_string += string[num]
		num-=1
	return reverse_string

print reverse_string("Example String")