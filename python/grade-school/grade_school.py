class School:
    def __init__(self):
        self.students = {}

    def add_student(self, name, grade):
        children = self.students.get(grade, []) + [name]
        self.students[grade] = sorted(children)

    def roster(self):
        grades = sorted(self.students.keys())
        return [child for grade in grades for child in self.grade(grade)]

    def grade(self, grade_number):
        return self.students.get(grade_number, [])
