def leap_year(year):
    div4 = year % 4 == 0
    div100 = year % 100 == 0
    div400 = year % 400 == 0
    return (div4 and not div100) or div400
