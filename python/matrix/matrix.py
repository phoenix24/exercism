class Matrix:
    def __init__(self, string):
        self.matrix = [[int(y) for y in x.split()] for x in string.split("\n")]

    def row(self, index):
        return self.matrix[index - 1]

    def column(self, index):
        return [row[index - 1] for row in self.matrix]
