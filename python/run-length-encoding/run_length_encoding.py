def decode(string):
    counter, result = '', ''
    for s in string:
        if s.isalpha() or s.isspace():
            result += int(counter or '1') * s
            counter = ''
        else:
            counter += s
    return result

def encode(string):
    counter, result, char = 0, '', ''

    def update(rs, cc, ch):
        if cc == 0: return rs
        if cc == 1: return '%s%s' % (result, ch)
        return '%s%s%s' % (result, cc, ch)
            
    for s in string:
        if s != char:
            result = update(result, counter, char)
            char = s
            counter = 0
        counter += 1

    return update(result, counter, char)
    
