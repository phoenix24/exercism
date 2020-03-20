import random

class Robot:
    def __init__(self):
        self.used = set()
        self.name = None
        self.reset()

    def genrt(self):
        chars = [chr(random.randint(65, 90)) for _ in range(2)]
        numbers = [str(random.randint(0, 9)) for _ in range(3)]
        return "".join(chars + numbers)

    def reset(self):
        name = self.genrt()
        while name in self.used:
            name = self.genrt()
        self.name = name
        self.used.add(name)
        
