# Globals for the directions
# Change the values as you see fit
EAST = "E"
WEST = "W"
NORTH = "N"
SOUTH = "S"

class Robot:
    def __init__(self, direction=NORTH, x=0, y=0):
        self.direction = direction
        self.coordinates = (x, y)
        self.dodrive = {
            "WA": lambda coord: (coord[0]-1, coord[1]),
            "EA": lambda coord: (coord[0]+1, coord[1]),
            "NA": lambda coord: (coord[0], coord[1]+1),
            "SA": lambda coord: (coord[0], coord[1]-1),
        }
        self.dodirection = {
            "NR": "E", "NL": "W",
            "ER": "S", "EL": "N",
            "WR": "N", "WL": "S",
            "SR": "W", "SL": "E",
        }

    def move(self, movement):
        for m in movement:
            if m in ["R", "L"]:
                self.direction = self.dodirection[self.direction + m]
            else:
                self.coordinates = self.dodrive[self.direction + "A"](self.coordinates)
    
