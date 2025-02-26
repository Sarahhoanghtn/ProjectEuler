max = 100

def sumSquare():
    sum = 0
    for i in range(1, max + 1):
        sum += i ** 2

    return sum

def squareSum():
    sum = int(max / 2 * (1 + max)) # Arithmetic Sequence
    return sum ** 2

print(squareSum() - sumSquare())
