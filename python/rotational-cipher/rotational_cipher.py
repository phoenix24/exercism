def rotate(text, key):
    lalpha = "abcdefghijklmnopqrstuvwxyz"
    ualpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def next(t):
        alpha = lalpha if t in lalpha else ualpha
        offset = ord('a') if t in lalpha else ord('A')
        return alpha[ (ord(t) - offset + key) % 26 ]

    alpha = lambda x: x if not x.isalpha() else next(x)
    return "".join([alpha(t) for i, t in enumerate(text)])
