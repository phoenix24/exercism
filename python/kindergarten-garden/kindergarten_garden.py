class Garden:
    def __init__(self, diagram, students=[]):
        self.diagram = diagram
        self.pmap = {"V": "Violets", "R":"Radishes", "C":"Clover", "G":"Grass"}
        self.students = sorted(students) or ["Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Illeana", "Jospeph", "Kincaid", "Larry"]
    
    def plants(self, student):
        index = self.students.index(student) * 2
        row1, row2 = self.diagram.split()
        plants = row1[index:index+2] + row2[index:index+2]
        return [self.pmap[p] for p in plants]
    
