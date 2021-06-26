#Construa um algoritmo modularizado que, a partir de um vetor de 100 inteiros (utilize a função de geração de valores aleatórios), possibilite:
# a digitação dos valores do vetor (entrada de dados)
# imprimir o valor do somatório dos seus itens
# imprimir a média dos valores fornecidos
# calcular o desvio padrão
# substituir por zero todos os valores negativos
# substituir por zero todos os valores repetidos (maiores que zero)

import random
lista = []
k = 1
while k <= 100:
    x = random.randint(1, 100)
    if x not in lista:
        lista.append(x)
        k += 1

qtd_value = len(lista)
sum_value = sum(lista)
media_value = sum_value/qtd_value
lista_sem_repeticoes = list(set(lista))


for index, value in enumerate(lista):
    if value < 0:
        lista[index] = 0

print(lista)
print('Os valores da lista são', lista)
print('A quantidade de valores da lista são', qtd_value)
print('A soma dos valores da lista é igual a', sum_value)
print('A média dos valores é igual a', media_value)
print(lista_sem_repeticoes)