class Luhn:
    def __init__(self, number):
        self.digits = list(reversed([x for x in number if x.isdigit()]))
        self.isvalid = number.replace(" ", "").isdigit()

    def valid(self):
        if len(self.digits) <= 1 or not self.isvalid: return False
        dobl = lambda x: int(x) * 2 
        incr = lambda x: dobl(x) - 9 if dobl(x) > 9 else dobl(x)
        odds = sum([incr(x) for i, x in enumerate(self.digits) if i % 2 != 0])
        evens = sum([int(x) for i, x in enumerate(self.digits) if i % 2 == 0])
        return (odds + evens) % 10 == 0
