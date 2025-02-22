import math

def PE005():
    i = 2520
    prod = 20 * 19 
    i = math.ceil(2520 / prod) * prod # find the lowest number divisible by 19 * 20 > 2520

    while True:
        i += prod # i is divisible by 19 and 20 only if i is divisible by 19 * 20
        # if divisible by 11-20, i is divisible by 1-10
        for j in reversed(range(10, 19)):
            if i % j != 0:
                break
            if j == 11:
                return i

print(PE005())
