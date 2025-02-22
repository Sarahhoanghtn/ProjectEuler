min = 101
max = 999

def isPal(a):
    a = str(a)
    if a == a[::-1]: # if string a is equal to reversed string a
        return True
    return False

maxProduct = 1

for i in reversed(range(min, max)):
    for j in reversed(range(maxProduct // i, i)): # avoid traversing through products < current maxProduct & repeating product pairs
        product = i * j
        if isPal(product) and product > maxProduct:
            maxProduct = product

print(maxProduct)
