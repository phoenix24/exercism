
def rotate(text, key):
    chars = "abcdefghijklmnopqrstuvwxyz"
    nchars = chars[key:] + chars[:key]
    ttable = str.maketrans(chars + chars.upper(), nchars + nchars.upper())
    return text.translate(ttable)
