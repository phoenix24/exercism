def latest(scores):
    return scores[-1]


def personal_best(scores):
    return max(scores)


def personal_top_three(scores):
    scores = sorted(scores, reverse=True)
    return scores[:3]
