def to_rna(strand):
    mapping = {"G":"C", "C":"G", "T":"A", "A":"U"}
    return "".join([mapping[s] for s in strand])
