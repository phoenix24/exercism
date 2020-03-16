class Clock:
    def __init__(self, hour, minute):
        self.hour, self.minute = self.__time(hour, minute)

    def __time(self, hour, minute):
        ms = 60 * hour + minute
        hours = ms // 60
        minutes = (ms - hours * 60) % 60
        return (hours % 24, minutes)

    def __repr__(self):
        return "%02d:%02d" % (self.hour, self.minute)

    def __eq__(self, other):
        return self.hour == other.hour \
            and self.minute == other.minute

    def __add__(self, minutes):
        hour, minutes = self.__time(self.hour, self.minute + minutes)
        return Clock(hour, minutes)

    def __sub__(self, minutes):
        hour, minutes = self.__time(self.hour, self.minute - minutes)
        return Clock(hour, minutes)

