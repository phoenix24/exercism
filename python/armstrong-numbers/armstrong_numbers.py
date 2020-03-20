def is_armstrong_number(number):
    digits = list(map(int, list(str(number))))
    length = len(digits)
    return sum([d ** length for d in digits]) == number
