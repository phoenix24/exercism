def slices(series, length):
    if length <= 0 or length > len(series) or not series: raise ValueError("invalid params")
    return [series[x:x+length] for x in range(0, len(series) - length + 1)]
