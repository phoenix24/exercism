from collections import Counter

def find_anagrams(word, candidates):
    word = word.upper()
    check = lambda cand: (Counter(word) == Counter(cand)) and (word != cand)
    return [cand for cand in candidates if check(cand.upper())]
