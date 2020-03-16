def is_valid(isbn):
    counter = [int(s) for s in isbn if s.isdigit()]
    counter = [int(s) * (11 - i) for i, s in enumerate(counter, 1)]

    if len(counter) == 9 and isbn.endswith("X"):
        return (sum(counter) + 10) % 11 == 0

    if len(counter) == 10:
        return sum(counter) % 11 == 0

    return False

