#Construa uma função que calcule o Arranjo de N elementos, p a p. Utilize a fórmula A = N!/(N-P)!


def fact(n):
    f = 1
    while n > 0:
        f = f * n
        n = n - 1
    return f
for i in range(5):
    print(fact(i))     

   
    