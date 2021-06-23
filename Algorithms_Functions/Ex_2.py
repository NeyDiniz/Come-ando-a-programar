#Construa uma função que calcule a Combinação de N elementos p a p. Utilize a fórmula C = N!/(p!*(N-p)!)

def factorial(n):
    i = 1
    f = 1

    while n > 0:
        f = f * n
        n = n - 1
    return f


n = 7
p = 4

def arranjo(n, p):
    i = 1
    f = 1
    while n > 0:
        f *= n
        n -= 1
        return n
    while p > 0:
        f *= p
        p -= 1
        return p

C = factorial(n)/(factorial(p) * factorial(n - p))
print("O resultado da combinação é", C)