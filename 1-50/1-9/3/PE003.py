target = 600851475143
i = 2

while i ** 2 < target: # Only check up to sqrt(target)
    if target % i == 0:
        target //= i
    else:
        i += 1

print(target)