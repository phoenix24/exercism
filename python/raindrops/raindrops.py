def convert(number):
    r3 = "Pling" if number % 3 == 0 else ""
    r5 = "Plang" if number % 5 == 0 else ""
    r7 = "Plong" if number % 7 == 0 else ""
    mg = "%s%s%s" % (r3, r5, r7)
    return mg if mg else str(number)
