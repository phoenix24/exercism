num, primes = 1, [1]

def isprime(n):
    for x in range(2, n):
        if (n % x == 0): return False
    return True

def next(n):
    while not isprime(n):
        n += 1
    return n

def prime(number):
    global num, primes

    if not number:
        raise ValueError("must be a number greater than 1")

    while number >= len(primes):
        num = next(num+1)
        primes.append(num)

    return primes[number]

