def response(hey_bob):
    msg = hey_bob.strip()
    
    upper = all([x.isupper() for x in msg if x.isalpha()] or [False]) 
    question = msg.endswith("?")

    if msg == "":
        return "Fine. Be that way!"

    if upper and question:
        return "Calm down, I know what I'm doing!"

    if upper:
        return "Whoa, chill out!"

    if question:
        return "Sure."
    
    return "Whatever."
