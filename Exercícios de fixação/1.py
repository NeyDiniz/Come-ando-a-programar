L = [1, 7, 4, 12, -2]
x = L[0]
while True:
    L = L[1:]
    if not L:
        break
    if L[0] > x:
        x = L[0]
print (x)