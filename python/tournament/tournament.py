points = {"W":3, "L":0, "D":1}
second = {"W":"L", "D":"D", "L":"W"}

def update_score(teams, team, result):
    if team not in teams:
        teams[team] = {"MP":0, "W":0, "D":0, "L":0, "P":0}
    teams[team]["MP"] += 1
    teams[team][result] += 1
    teams[team]["P"] += points[result]

def tally(rows):
    teams = {}
    ttally = ["Team                           | MP |  W |  D |  L |  P"]

    for row in rows:
        team1, team2, result = row.split(";")
        result = result[0].upper()
        update_score(teams, team1, result)
        update_score(teams, team2, second[result])

    for team in sorted(sorted(teams.items()), key=lambda x: x[1]["P"], reverse=True):
        name, score = team
        output = "%-30s | %2d | %2d | %2d | %2d | %2d" % (name, score["MP"], score["W"], score["D"], score["L"], score["P"])
        ttally.append(output)
    return ttally
