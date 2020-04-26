
pairs = {
  "{":"}",
  "(":")",
  "[":"]"
}

def is_paired(string):
    stack = []
    for x in string:
        if not (x in pairs.keys() or x in pairs.values()):
            continue

        if x in pairs.keys():
            stack.append(x)

        elif stack and x == pairs[stack[-1]]:
            stack.pop()

        else:
            return False

    return len(stack) == 0
