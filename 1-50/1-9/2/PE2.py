limit = 4000000
sum = 2
evenFib1 = 0
evenFib2 = 2

while True:
    evenFib3 = 4 * evenFib2 + evenFib1 # Every third Fibonacci number is even
    if evenFib3 > limit:
        break

    sum += evenFib3
    evenFib1 = evenFib2
    evenFib2 = evenFib3

print(sum)
