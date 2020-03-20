class BufferFullException(Exception):
    pass


class BufferEmptyException(Exception):
    pass


class CircularBuffer:
    def __init__(self, capacity):
        self.capacity = capacity
        self.__initialize()
    
    def __initialize(self):
        self.items = 0
        self.reader = 0
        self.writer = 0
        self.buffer = [None] * self.capacity

    def read(self):
        if self.reader == self.writer:
            raise BufferEmptyException("exception")
        index = self.reader % self.capacity
        self.items -= 1
        self.reader += 1
        return self.buffer[index]

    def write(self, data):
        if self.items == self.capacity:
            raise BufferFullException("bufferfull exception")
        index = self.writer % self.capacity
        self.items += 1
        self.writer += 1
        self.buffer[index] = data

    def overwrite(self, data):
        index = self.writer % self.capacity
        if self.items == self.capacity:
            self.reader += 1
        self.writer += 1
        self.buffer[index] = data

    def clear(self):
        self.__initialize()
