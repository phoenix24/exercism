def hexa(hex):
    hmap = {"A": 10, "B": 11, "C": 12, "D": 13, "E": 14, "F": 15}
    return sum([(hmap.get(char) or int(char)) * 16 ** index  for index, char in enumerate(hex.upper()[::-1])])

