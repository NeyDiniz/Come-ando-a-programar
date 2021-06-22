#Construa uma função que calcule o Arranjo de N elementos, p a p. Utilize a fórmula A = N!/(N-P)!


def fact(n):
    f = 1
    while n > 0:
        f = f * n
        n = n - 1
    return f

for i in range(1):
    print(fact(i))     


def arranjo(N, P):
    for n in range(1, N):
        A = fact(n)/(fact (n - P))
        
        print("O valor será", A)
n = 8
P = 6


   
    