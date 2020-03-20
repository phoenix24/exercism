def square_of_sum(number):
    return sum([x for x in range(number + 1)]) ** 2
    
def sum_of_squares(number):
    return sum([x ** 2 for x in range(number + 1)])


def difference_of_squares(number):
    t1 = square_of_sum(number)
    t2 = sum_of_squares(number)
    return t1 - t2
