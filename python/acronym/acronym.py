def abbreviate(words):
    words = words.replace("-", " ").replace("_", " ").split()
    return "".join([w[0] for w in words]).upper()
