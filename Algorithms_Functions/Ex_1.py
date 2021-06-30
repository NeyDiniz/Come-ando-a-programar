#Construa uma função que calcule o Arranjo de N elementos, p a p. Utilize a fórmula A = N!/(N-P)!

def factorial(n):
    i = 1
    f = 1

    while n > 0:
        f = f * n
        n = n - 1
    return f


n = 8
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

a = factorial(n)/(factorial(n - p))
print("O resultado do arranjo é", a)
