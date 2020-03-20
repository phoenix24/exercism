letters = "abcdefghijklmnopqrstuvwxyz" 

def encode(plain_text):
    text = "".join([x for x in plain_text.lower() if x.isalnum()])
    translate = str.maketrans(letters, letters[::-1])
    translated = text.translate(translate)
    return " ".join([translated[i:i+5] for i in range(0, len(translated), 5)])


def decode(ciphered_text):
    text = ciphered_text.replace(' ', '')
    translate = str.maketrans(letters[::-1], letters)
    return text.translate(translate)
