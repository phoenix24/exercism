def is_pangram(sentence):
    letters = 'abcdefghijklmnopqrstuvwxyz'
    sentence = set([c for c in sentence.lower() if c in letters])
    return set(letters) == set(sentence)
