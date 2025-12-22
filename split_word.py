from functools import reduce

def split_words(words, word):
	return words + "" + word

words = "i love programming"
splited_words = reduce(split_words, words)
print(splited_words)
