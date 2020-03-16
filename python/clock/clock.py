class Clock:
    def __init__(self, hour, minute):
        self.ms = 60 * hour + minute
        self.hour, self.minute = self.__time(60 * hour + minute)

    def __time(self, minutes):
        hour = minutes // 60
        minutes = (minutes - hour * 60) % 60
        return (hour % 24, minutes)

    def __repr__(self):
        return "%02d:%02d" % (self.hour, self.minute)

    def __eq__(self, other):
        return self.hour == other.hour \
            and self.minute == other.minute

    def __add__(self, minutes):
        hour, minutes = self.__time(self.ms + minutes)
        return Clock(hour, minutes)

    def __sub__(self, minutes):
        hour, minutes = self.__time(self.ms - minutes)
        return Clock(hour, minutes)

